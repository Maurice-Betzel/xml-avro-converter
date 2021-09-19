/**
 * Copyright 2016-2017 MIT Lincoln Laboratory, Massachusetts Institute of Technology
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 * This material is based upon work supported by the Federal Aviation
 * Administration under Air Force Contract No. FA8721-05-C-0002 and/or
 * FA8702-15-D-0001. Any opinions, findings, conclusions or recommendations
 * expressed in this material are those of the author(s) and do not
 * necessarily reflect the views of the Federal Aviation Administration.
 * <p>
 * Delivered to the U.S. Government with Unlimited Rights, as defined in
 * DFARS Part 252.227-7013 or 7014 (Feb 2014). Notwithstanding any copyright
 * notice, U.S. Government rights in this work are defined by DFARS
 * 252.227-7013 or DFARS 252.227-7014 as detailed above. Use of this work
 * other than as specifically authorized by the U.S. Government may violate
 * any copyrights that exist in this work.
 */

package edu.mit.ll.xml_avro_converter.sample_types;

// A sample subtype of sample base type
public class SampleSubtype extends SampleBaseType {

    public int subtypeVal;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.baseVal;
        hash = 53 * hash + this.subtypeVal;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SampleSubtype other = (SampleSubtype) obj;
        if (this.baseVal != other.baseVal) {
            return false;
        }
        if (this.subtypeVal != other.subtypeVal) {
            return false;
        }
        return true;
    }
}
