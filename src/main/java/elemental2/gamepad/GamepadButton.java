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
 * The GamepadButton interface defines an individual button of a gamepad or other controller, allowing access to the current state of different types of buttons available on the control device.
 * <p>
 * A GamepadButton object is returned by querying any value of the array returned by the buttons property of the Gamepad interface.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 5/29/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class GamepadButton {

    private GamepadButton(){

    }

    /**
     * The values are normalized to the range 0.0 — 1.0, with 0.0 representing a button that is not pressed, and 1.0 representing a button that is fully pressed.
     *
     * @return value property of the GamepadButton interface returns a double value used to represent the current state of analog buttons on many modern gamepads, such as the triggers.
     */
    @JsProperty
    public native double getValue();

    /**
     * The pressed property of the GamepadButton interface returns a boolean indicating whether the button is currently pressed (true) or unpressed (false).
     * @return true, if pressed
     */
    @JsProperty
    public native boolean isPressed();
}
