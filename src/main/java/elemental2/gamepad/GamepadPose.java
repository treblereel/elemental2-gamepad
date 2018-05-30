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

import elemental2.core.Float32Array;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * WARNING !!! THIS PACKAGE WILL BE REMOVED AFTER RELEASE OF ORIGINAL ELEMENTAL2
 * <p>
 * This is an experimental technology
 * Check the Browser compatibility table carefully before using this in production.
 * <p>
 * The GamepadPose interface of the Gamepad API represents the pose of a WebVR controller at a given timestamp (which includes orientation, position, velocity, and acceleration information.)
 * <p>
 * This interface is accessible through the Gamepad.pose property.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 5/29/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class GamepadPose {

    private GamepadPose(){

    }

    /**
     * This is an experimental technology
     * Check the Browser compatibility table carefully before using this in production.
     * The hasOrientation read-only property of the GamepadPose interface returns a Boolean stating whether the Gamepad can track and return orientation information.
     *
     * @return true, if has orientation
     */
    @JsProperty(name = "hasOrientation")
    public native boolean hasOrientation();

    /**
     * This is an experimental technology
     * Check the Browser compatibility table carefully before using this in production.
     * <p>
     * The hasPosition read-only property of the GamepadPose interface returns a Boolean stating whether the Gamepad can track and return position information.
     *
     * @return true, if has position
     */
    @JsProperty(name = "hasPosition")
    public native boolean hasPosition();

    /**
     * The position read-only property of the GamepadPose interface returns the position of the Gamepad as a 3D vector.
     * <p>
     * The coordinate system is as follows:
     * <p>
     * Positive X is to the user’s right.
     * Positive Y is up.
     * Positive Z is behind the user.
     * Positions are measured in meters from an origin point — this point is the position the sensor was first read at.
     *
     * @return instance of Float32Array
     */
    @JsProperty
    public native Float32Array getPosition();

    /**
     * This is an experimental technology
     * Check the Browser compatibility table carefully before using this in production.
     * <p>
     * The linearVelocity read-only property of the GamepadPose interface returns an array representing the linear velocity vector of the Gamepad, in meters per second.
     * <p>
     * In other words, the current velocity at which the sensor is moving along the x, y, and z axes.
     *
     * @return instance of Float32Array
     */
    @JsProperty
    public native Float32Array getLinearVelocity();

    /**
     * This is an experimental technology
     * Check the Browser compatibility table carefully before using this in production.
     * <p>
     * The linearAcceleration read-only property of the GamepadPose interface returns an array representing the linear acceleration vector of the Gamepad, in meters per second per second.
     * <p>
     * In other words, the current acceleration of the sensor, along the x, y, and z axes.
     *
     * @return instance of Float32Array
     */
    @JsProperty
    public native Float32Array getLinearAcceleration();

    /**
     * This is an experimental technology
     * Check the Browser compatibility table carefully before using this in production.
     * <p>
     * The orientation read-only property of the GamepadPose interface returns the orientation of the Gamepad, as a quarternion value.
     * <p>
     * The value is a Float32Array, made up of the following values:
     * <p>
     * pitch — rotation around the X axis.
     * yaw — rotation around the Y axis.
     * roll — rotation around the Z axis.
     * w — the fourth dimension (usually 1).
     * The orientation yaw (rotation around the y axis) is relative to the initial yaw of the sensor when it was first read.
     *
     * @return instance of Float32Array
     */
    @JsProperty
    public native Float32Array getOrientation();

    /**
     * This is an experimental technology
     * Check the Browser compatibility table carefully before using this in production.
     * <p>
     * The angularVelocity read-only property of the GamepadPose interface returns an array representing the angular velocity vector of the Gamepad, in radians per second.
     * <p>
     * In other words, the current velocity at which the sensor is rotating around the x, y, and z axes.
     *
     * @return instance of Float32Array
     */
    @JsProperty
    public native Float32Array getAngularVelocity();

    /**
     * This is an experimental technology
     * Check the Browser compatibility table carefully before using this in production.
     * <p>
     * The angularAcceleration read-only property of the GamepadPose interface returns an array representing the angular acceleration vector of the Gamepad, in meters per second per second.
     * <p>
     * In other words, the current acceleration of the sensor's rotation around the x, y, and z axes.
     *
     * @return instance of Float32Array
     */
    @JsProperty
    public native Float32Array getAngularAcceleration();


}
