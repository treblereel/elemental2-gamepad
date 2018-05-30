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
import jsinterop.annotations.JsType;

/**
 * WARNING !!! THIS PACKAGE WILL BE REMOVED AFTER RELEASE OF ORIGINAL ELEMENTAL2
 * <p>
 * The actuator type determines the force applied for a given value in GamepadHapticActuator.pulse().
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 5/29/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class GamepadHapticActuatorType {

    /**
     * Vibration is a rumbling effect often implemented as an offset weight driven on a rotational axis. The value of a vibration force determines the frequency of the rumble effect and is normalized between 0.0 and 1.0. The neutral value is 0.0.
     */
    public static String VIBRATION;


}
