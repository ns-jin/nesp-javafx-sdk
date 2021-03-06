/*
 * Copyright  2019.  靳兆鲁（1756404649@qq.com）
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.nesp.javafx.sdk.java.utils;


import javafx.scene.Node;
import javafx.stage.Stage;

public class MouseEventUtils {

    private static double xOffset = 0;
    private static double yOffset = 0;

    /**
     * 鼠标点击拖拽窗口
     *
     * @param node  拖拽节点
     * @param stage 窗口
     */
    public static void setDragToMove(Node node, Stage stage) {

        node.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });

        node.setOnMouseDragged(event -> {
            stage.setX(event.getScreenX() - xOffset);
            stage.setY(event.getScreenY() - yOffset);
        });
    }
}
