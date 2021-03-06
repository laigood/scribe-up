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
package org.scribe.up.test.profile.converter;

import java.util.Locale;

import junit.framework.TestCase;

import org.scribe.up.profile.FormattedDate;
import org.scribe.up.profile.converter.FormattedDateConverter;
import org.scribe.up.test.util.CommonHelper;

/**
 * This class tests the {@link org.scribe.up.profile.converter.FormattedDateConverter} class.
 * 
 * @author Jerome Leleu
 * @since 1.1.0
 */
public final class TestFormattedDateConverter extends TestCase {
    
    private final static String FORMAT = "EEE MMM dd HH:mm:ss Z yyyy";
    
    private final static Locale LOCALE = Locale.FRANCE;
    
    private FormattedDateConverter converter = new FormattedDateConverter(FORMAT, LOCALE);
    
    private final static String DATE = CommonHelper.getFormattedDate(0, FORMAT, LOCALE);
    
    public void testNull() {
        assertNull(converter.convert(null));
    }
    
    public void testNotAString() {
        assertNull(converter.convert(1));
    }
    
    public void testDate() {
        FormattedDate d = converter.convert(DATE);
        assertEquals(DATE, d.toString());
    }
}
