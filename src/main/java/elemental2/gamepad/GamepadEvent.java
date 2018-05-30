/*
 *       Copyright 2018 Dmitrii Tikhomirov
 *
 *        Licensed under the Apache License, Version 2.0 (the "License");
 *        you may not use this file except in compliance with the License.
 *        You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *        Unless required by applicable law or agreed to in writing, software
 *        distributed under the License is distributed on an "AS IS" BASIS,
 *        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *        See the License for the specific language governing permissions and
 *        limitations under the License.
 */
package elemental2.gamepad;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * WARNING !!! THIS PACKAGE WILL BE REMOVED AFTER RELEASE OF ORIGINAL ELEMENTAL2
 * <p>
 * The GamepadEvent interface of the Gamepad API contains references to gamepads connected to the system, which is what the gamepad events Window.gamepadconnected and Window.gamepaddisconnected are fired in response to.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 5/29/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class GamepadEvent {

    private GamepadEvent() {

    }

    /**
     * The gamepad property of the GamepadEvent interface returns a Gamepad object, providing access to the associated gamepad data for fired gamepadconnected and gamepaddisconnected events.
     * <p>
     * Note: These events are not fired in Chrome, only Firefox. In Chrome you have to use Navigator.getGamepads to access Gamepad objects.
     *
     * @return instance of Gamepad
     */
    @JsProperty
    public native Gamepad getGamepad();
}
