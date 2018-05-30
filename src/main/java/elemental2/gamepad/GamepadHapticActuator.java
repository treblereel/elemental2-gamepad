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

import elemental2.promise.Promise;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * WARNING !!! THIS PACKAGE WILL BE REMOVED AFTER RELEASE OF ORIGINAL ELEMENTAL2
 * <p>
 * This is an experimental technology
 * Check the Browser compatibility table carefully before using this in production.
 * <p>
 * The GamepadHapticActuator interface of the Gamepad API represents hardware in the controller designed to provide haptic feedback to the user (if available), most commonly vibration hardware.
 * <p>
 * This interface is accessible through the Gamepad.hapticActuators property.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 5/29/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class GamepadHapticActuator {

    private GamepadHapticActuator() {

    }

    /**
     * The type read-only property of the GamepadHapticActuator interface returns an enum representing the type of the haptic hardware.
     *
     * @return instance of GamepadHapticActuatorType
     */
    @JsProperty
    public native GamepadHapticActuatorType getType();

    /**
     * The pulse() method of the GamepadHapticActuator interface makes the hardware pulse at a certain intensity for a specified duration.
     *
     * @param value    A double representing the intensity of the pulse. This can vary depending on the hardware type, but generally takes a value between 0.0 (no intensity) and 1.0 (full intensity).
     * @param duration A double representing the duration of the pulse, in milliseconds.
     * @return A promise that resolves with a value of true when the pulse has successfully completed.
     */
    public native Promise pulse(double value, double duration);
}
