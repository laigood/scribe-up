/*
  Copyright 2012 Jerome Leleu

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.scribe.up.profile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.scribe.up.profile.converter.AttributeConverter;

/**
 * This class is the definition of the attributes of a profile.
 * 
 * @author Jerome Leleu
 * @since 1.1.0
 */
public class AttributesDefinition {
    
    protected List<String> attributes = new ArrayList<String>();
    
    protected Map<String, AttributeConverter<? extends Object>> converters = new HashMap<String, AttributeConverter<? extends Object>>();
    
    public List<String> getAttributes() {
        return attributes;
    }
    
    /**
     * Convert an attribute into the right type. If no converter exists for this attribute name, the attribute is ignored and null is
     * returned.
     * 
     * @param name
     * @param value
     * @return the converted attribute or null if no converter exists for this attribute name
     */
    public Object convert(String name, Object value) {
        AttributeConverter<? extends Object> converter = converters.get(name);
        if (converter != null && value != null) {
            return converter.convert(value);
        } else {
            return null;
        }
    }
}
