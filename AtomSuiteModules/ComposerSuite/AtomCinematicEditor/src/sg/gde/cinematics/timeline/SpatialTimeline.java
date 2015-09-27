/*
 *  Copyright (c) 2009-2010 jMonkeyEngine
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are
 *  met:
 *
 *  * Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 *  * Neither the name of 'jMonkeyEngine' nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 *  "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 *  TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 *  PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 *  EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 *  PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 *  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 *  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package sg.gde.cinematics.timeline;

import sg.gde.cinematics.controls.MovementControl;
import com.jme3.gde.core.scene.SceneApplication;
import com.jme3.gde.core.sceneexplorer.nodes.JmeSpatial;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import com.jme3.scene.control.AbstractControl;
import com.jme3.scene.control.Control;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 *
 * @author tomas
 */
public class SpatialTimeline extends Timeline<JmeSpatial> {

    public SpatialTimeline() {
    }

    @Override
    public JmeSpatial getObject() {
        return object;
    }

    @Override
    public void setObject(JmeSpatial object) {
        this.object = object;
    }

    @Override
    void reloadControls() {
        final Spatial spatial = ((Node) object.getLookup().lookup(Spatial.class)).getChild(0);
        System.out.println("Spatial: " + spatial);
        final ArrayList<Control> controls = new ArrayList<Control>();

        for (TimelineProperty timelineProperty : properties) {
            List<KeyFrame> keyFrames = timelineProperty.getKeyFrames();
            if (keyFrames.size() <= 1) {
                return;
            }

            for (int i = 0; i < keyFrames.size() - 1; i++) {
                KeyFrame start = keyFrames.get(i);
                KeyFrame end = keyFrames.get(i + 1);

                System.out.println("Start keyframe: " + start);
                System.out.println("End keyframe: " + end);

                controls.add(new MovementControl(spatial, (Vector3f) start.getValue(), (Vector3f) end.getValue(), end.getTime() - start.getTime()));
            }
        }


        SceneApplication.getApplication().enqueue(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                for (Control control : controls) {
                    spatial.addControl(control);
                    ((AbstractControl) control).setEnabled(true);
                }

                return null;
            }
        });
    }
}