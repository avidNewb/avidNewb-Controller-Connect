/**
 *  SnS Controller
 *
 *  Copyright 2021 DAVID NEWBERRY
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 */
metadata {
	definition (name: "SnS Controller", namespace: "avidNewb", author: "DAVID NEWBERRY", cstHandler: true) {
		capability "Activity Lighting Mode"
		capability "Button"
		capability "Signal Strength"
		capability "Temperature Measurement"
		capability "Test Capability"
	}


	simulator {
		// TODO: define status and reply messages here
	}

	tiles {
		// TODO: define your main and details tiles here
	}
}

// parse events into attributes
def parse(String description) {
	log.debug "Parsing '${description}'"
	// TODO: handle 'lightingMode' attribute
	// TODO: handle 'button' attribute
	// TODO: handle 'numberOfButtons' attribute
	// TODO: handle 'supportedButtonValues' attribute
	// TODO: handle 'lqi' attribute
	// TODO: handle 'rssi' attribute
	// TODO: handle 'temperature' attribute

}

// handle commands
def setLightingMode() {
	log.debug "Executing 'setLightingMode'"
	// TODO: handle 'setLightingMode' command
}