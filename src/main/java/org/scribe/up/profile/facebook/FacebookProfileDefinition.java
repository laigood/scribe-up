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
package org.scribe.up.profile.facebook;

import org.scribe.up.profile.AttributesDefinition;
import org.scribe.up.profile.converter.Converters;

/**
 * This class defines the attributes of the Facebook profile.
 * 
 * @author Jerome Leleu
 * @since 1.1.0
 */
public class FacebookProfileDefinition extends AttributesDefinition {
    
    public static final String NAME = "name";
    public static final String FIRST_NAME = "first_name";
    public static final String MIDDLE_NAME = "middle_name";
    public static final String LAST_NAME = "last_name";
    public static final String GENDER = "gender";
    public static final String LOCALE = "locale";
    public static final String LANGUAGES = "languages";
    public static final String LINK = "link";
    public static final String USERNAME = "username";
    public static final String THIRD_PARTY_ID = "third_party_id";
    public static final String TIMEZONE = "timezone";
    public static final String UPDATED_TIME = "updated_time";
    public static final String VERIFIED = "verified";
    public static final String BIO = "bio";
    public static final String BIRTHDAY = "birthday";
    public static final String EDUCATION = "education";
    public static final String EMAIL = "email";
    public static final String HOMETOWN = "hometown";
    public static final String INTERESTED_IN = "interested_in";
    public static final String LOCATION = "location";
    public static final String POLITICAL = "political";
    public static final String FAVORITE_ATHLETES = "favorite_athletes";
    public static final String FAVORITE_TEAMS = "favorite_teams";
    public static final String QUOTES = "quotes";
    public static final String RELATIONSHIP_STATUS = "relationship_status";
    public static final String RELIGION = "religion";
    public static final String SIGNIFICANT_OTHER = "significant_other";
    public static final String WEBSITE = "website";
    public static final String WORK = "work";
    
    public FacebookProfileDefinition() {
        String[] names = new String[] {
            NAME, FIRST_NAME, MIDDLE_NAME, LAST_NAME, LINK, USERNAME, THIRD_PARTY_ID, BIO, EMAIL, POLITICAL, QUOTES,
            RELIGION, WEBSITE
        };
        for (String name : names) {
            attributes.add(name);
            converters.put(name, Converters.stringConverter);
        }
        attributes.add(TIMEZONE);
        converters.put(TIMEZONE, Converters.integerConverter);
        attributes.add(VERIFIED);
        converters.put(VERIFIED, Converters.booleanConverter);
        attributes.add(GENDER);
        converters.put(GENDER, FacebookConverters.genderConverter);
        attributes.add(LOCALE);
        converters.put(LOCALE, Converters.localeConverter);
        attributes.add(UPDATED_TIME);
        converters.put(UPDATED_TIME, FacebookConverters.updateTimeConverter);
        attributes.add(BIRTHDAY);
        converters.put(BIRTHDAY, FacebookConverters.birthdayConverter);
        attributes.add(RELATIONSHIP_STATUS);
        converters.put(RELATIONSHIP_STATUS, FacebookConverters.relationshipStatusConverter);
        attributes.add(LANGUAGES);
        converters.put(LANGUAGES, FacebookConverters.listObjectConverter);
        attributes.add(EDUCATION);
        converters.put(EDUCATION, FacebookConverters.listEducationConverter);
        attributes.add(HOMETOWN);
        converters.put(HOMETOWN, FacebookConverters.objectConverter);
        attributes.add(INTERESTED_IN);
        converters.put(INTERESTED_IN, Converters.listStringConverter);
        attributes.add(LOCATION);
        converters.put(LOCATION, FacebookConverters.objectConverter);
        attributes.add(FAVORITE_ATHLETES);
        converters.put(FAVORITE_ATHLETES, FacebookConverters.listObjectConverter);
        attributes.add(FAVORITE_TEAMS);
        converters.put(FAVORITE_TEAMS, FacebookConverters.listObjectConverter);
        attributes.add(SIGNIFICANT_OTHER);
        converters.put(SIGNIFICANT_OTHER, FacebookConverters.objectConverter);
        attributes.add(WORK);
        converters.put(WORK, FacebookConverters.listWorkConverter);
    }
}
