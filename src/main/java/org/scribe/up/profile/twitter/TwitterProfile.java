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
package org.scribe.up.profile.twitter;

import java.awt.Color;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.scribe.up.profile.AttributesDefinition;
import org.scribe.up.profile.ProfileDefinitions;
import org.scribe.up.profile.UserProfile;
import org.scribe.up.provider.impl.TwitterProvider;

/**
 * This class is the user profile for Twitter with appropriate getters.
 * 
 * @author Jerome Leleu
 * @since 1.1.0
 */
public class TwitterProfile extends UserProfile {
    
    private static final long serialVersionUID = -6665446348249419048L;
    
    protected AttributesDefinition getAttributesDefinition() {
        return ProfileDefinitions.twitterDefinition;
    }
    
    protected String getProviderType() {
        return TwitterProvider.TYPE;
    }
    
    public TwitterProfile() {
        super();
    }
    
    public TwitterProfile(Object id) {
        super(id);
    }
    
    public TwitterProfile(Object id, Map<String, Object> attributes) {
        super(id, attributes);
    }
    
    /**
     * Indicate if the user identifier matches this kind of profile.
     * 
     * @param id
     * @return if the user identifier matches this kind of profile
     */
    public static boolean isTypedIdOf(String id) {
        if (id != null && id.startsWith(TwitterProvider.TYPE + SEPARATOR)) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isContributorsEnabled() {
        return getSafeBoolean((Boolean) attributes.get(TwitterProfileDefinition.CONTRIBUTORS_ENABLED));
    }
    
    /**
     * Indicate if the contributors_enabled attribute exists.
     * 
     * @return if the contributors_enabled attribute exists
     */
    public boolean isContributorsEnabledDefined() {
        return attributes.get(TwitterProfileDefinition.CONTRIBUTORS_ENABLED) != null;
    }
    
    public Date getCreatedAt() {
        return (Date) attributes.get(TwitterProfileDefinition.CREATED_AT);
    }
    
    public boolean isDefaultProfile() {
        return getSafeBoolean((Boolean) attributes.get(TwitterProfileDefinition.DEFAULT_PROFILE));
    }
    
    /**
     * Indicate if the default_profile attribute exists.
     * 
     * @return if the default_profile attribute exists
     */
    public boolean isDefaultProfileDefined() {
        return attributes.get(TwitterProfileDefinition.DEFAULT_PROFILE) != null;
    }
    
    public boolean isDefaultProfileImage() {
        return getSafeBoolean((Boolean) attributes.get(TwitterProfileDefinition.DEFAULT_PROFILE_IMAGE));
    }
    
    /**
     * Indicate if the default_profile_image attribute exists.
     * 
     * @return if the default_profile_image attribute exists
     */
    public boolean isDefaultProfileImageDefined() {
        return attributes.get(TwitterProfileDefinition.DEFAULT_PROFILE_IMAGE) != null;
    }
    
    public String getDescription() {
        return (String) attributes.get(TwitterProfileDefinition.DESCRIPTION);
    }
    
    public int getFavouritesCount() {
        return getSafeInteger((Integer) attributes.get(TwitterProfileDefinition.FAVOURITES_COUNT));
    }
    
    /**
     * Indicate if the favourites_count attribute exists.
     * 
     * @return if the favourites_count attribute exists
     */
    public boolean isFavouritesCountDefined() {
        return attributes.get(TwitterProfileDefinition.FAVOURITES_COUNT) != null;
    }
    
    public boolean isFollowRequestSent() {
        return getSafeBoolean((Boolean) attributes.get(TwitterProfileDefinition.FOLLOW_REQUEST_SENT));
    }
    
    /**
     * Indicate if the follow_request_sent attribute exists.
     * 
     * @return if the follow_request_sent attribute exists
     */
    public boolean isFollowRequestSentDefined() {
        return attributes.get(TwitterProfileDefinition.FOLLOW_REQUEST_SENT) != null;
    }
    
    public int getFollowersCount() {
        return getSafeInteger((Integer) attributes.get(TwitterProfileDefinition.FOLLOWERS_COUNT));
    }
    
    /**
     * Indicate if the followers_count attribute exists.
     * 
     * @return if the followers_count attribute exists
     */
    public boolean isFollowersCountDefined() {
        return attributes.get(TwitterProfileDefinition.FOLLOWERS_COUNT) != null;
    }
    
    public boolean isFollowing() {
        return getSafeBoolean((Boolean) attributes.get(TwitterProfileDefinition.FOLLOWING));
    }
    
    /**
     * Indicate if the following attribute exists.
     * 
     * @return if the following attribute exists
     */
    public boolean isFollowingDefined() {
        return attributes.get(TwitterProfileDefinition.FOLLOWING) != null;
    }
    
    public int getFriendsCount() {
        return getSafeInteger((Integer) attributes.get(TwitterProfileDefinition.FRIENDS_COUNT));
    }
    
    /**
     * Indicate if the friends_count attribute exists.
     * 
     * @return if the friends_count attribute exists
     */
    public boolean isFriendsCountDefined() {
        return attributes.get(TwitterProfileDefinition.FRIENDS_COUNT) != null;
    }
    
    public boolean isGeoEnabled() {
        return getSafeBoolean((Boolean) attributes.get(TwitterProfileDefinition.GEO_ENABLED));
    }
    
    /**
     * Indicate if the geo_enabled attribute exists.
     * 
     * @return if the geo_enabled attribute exists
     */
    public boolean isGeoEnabledDefined() {
        return attributes.get(TwitterProfileDefinition.GEO_ENABLED) != null;
    }
    
    public boolean isTranslator() {
        return getSafeBoolean((Boolean) attributes.get(TwitterProfileDefinition.IS_TRANSLATOR));
    }
    
    /**
     * Indicate if the is_translator attribute exists.
     * 
     * @return if the is_translator attribute exists
     */
    public boolean isTranslatorDefined() {
        return attributes.get(TwitterProfileDefinition.IS_TRANSLATOR) != null;
    }
    
    public Locale getLang() {
        return (Locale) attributes.get(TwitterProfileDefinition.LANG);
    }
    
    public int getListedCount() {
        return getSafeInteger((Integer) attributes.get(TwitterProfileDefinition.LISTED_COUNT));
    }
    
    /**
     * Indicate if the listed_count attribute exists.
     * 
     * @return if the listed_count attribute exists
     */
    public boolean isListedCountDefined() {
        return attributes.get(TwitterProfileDefinition.LISTED_COUNT) != null;
    }
    
    public String getLocation() {
        return (String) attributes.get(TwitterProfileDefinition.LOCATION);
    }
    
    public String getName() {
        return (String) attributes.get(TwitterProfileDefinition.NAME);
    }
    
    public boolean isNotifications() {
        return getSafeBoolean((Boolean) attributes.get(TwitterProfileDefinition.NOTIFICATIONS));
    }
    
    /**
     * Indicate if the notifications attribute exists.
     * 
     * @return if the notifications attribute exists
     */
    public boolean isNotificationsDefined() {
        return attributes.get(TwitterProfileDefinition.NOTIFICATIONS) != null;
    }
    
    public Color getProfileBackgroundColor() {
        return (Color) attributes.get(TwitterProfileDefinition.PROFILE_BACKGROUND_COLOR);
    }
    
    public String getProfileBackgroundImageUrl() {
        return (String) attributes.get(TwitterProfileDefinition.PROFILE_BACKGROUND_IMAGE_URL);
    }
    
    public String getProfileBackgroundImageUrlHttps() {
        return (String) attributes.get(TwitterProfileDefinition.PROFILE_BACKGROUND_IMAGE_URL_HTTPS);
    }
    
    public boolean isProfileBackgroundTile() {
        return getSafeBoolean((Boolean) attributes.get(TwitterProfileDefinition.PROFILE_BACKGROUND_TILE));
    }
    
    /**
     * Indicate if the profile_background_tile attribute exists.
     * 
     * @return if the profile_background_tile attribute exists
     */
    public boolean isProfileBackgroundTileDefined() {
        return attributes.get(TwitterProfileDefinition.PROFILE_BACKGROUND_TILE) != null;
    }
    
    public String getProfileImageUrl() {
        return (String) attributes.get(TwitterProfileDefinition.PROFILE_IMAGE_URL);
    }
    
    public String getProfileImageUrlHttps() {
        return (String) attributes.get(TwitterProfileDefinition.PROFILE_IMAGE_URL_HTTPS);
    }
    
    public Color getProfileLinkColor() {
        return (Color) attributes.get(TwitterProfileDefinition.PROFILE_LINK_COLOR);
    }
    
    public Color getProfileSidebarBorderColor() {
        return (Color) attributes.get(TwitterProfileDefinition.PROFILE_SIDEBAR_BORDER_COLOR);
    }
    
    public Color getProfileSidebarFillColor() {
        return (Color) attributes.get(TwitterProfileDefinition.PROFILE_SIDEBAR_FILL_COLOR);
    }
    
    public Color getProfileTextColor() {
        return (Color) attributes.get(TwitterProfileDefinition.PROFILE_TEXT_COLOR);
    }
    
    public boolean isProfileUseBackgroundImage() {
        return getSafeBoolean((Boolean) attributes.get(TwitterProfileDefinition.PROFILE_USE_BACKGROUND_IMAGE));
    }
    
    /**
     * Indicate if the profile_use_background_image attribute exists.
     * 
     * @return if the profile_use_background_image attribute exists
     */
    public boolean isProfileUseBackgroundImageDefined() {
        return attributes.get(TwitterProfileDefinition.PROFILE_USE_BACKGROUND_IMAGE) != null;
    }
    
    public boolean isProtected() {
        return getSafeBoolean((Boolean) attributes.get(TwitterProfileDefinition.PROTECTED));
    }
    
    /**
     * Indicate if the protected attribute exists.
     * 
     * @return if the protected attribute exists
     */
    public boolean isProtectedDefined() {
        return attributes.get(TwitterProfileDefinition.PROTECTED) != null;
    }
    
    public String getScreenName() {
        return (String) attributes.get(TwitterProfileDefinition.SCREEN_NAME);
    }
    
    public boolean isShowAllInlineMedia() {
        return getSafeBoolean((Boolean) attributes.get(TwitterProfileDefinition.SHOW_ALL_INLINE_MEDIA));
    }
    
    /**
     * Indicate if the show_all_inline_media attribute exists.
     * 
     * @return if the show_all_inline_media attribute exists
     */
    public boolean isShowAllInlineMediaDefined() {
        return attributes.get(TwitterProfileDefinition.SHOW_ALL_INLINE_MEDIA) != null;
    }
    
    public int getStatusesCount() {
        return getSafeInteger((Integer) attributes.get(TwitterProfileDefinition.STATUSES_COUNT));
    }
    
    /**
     * Indicate if the statuses_count attribute exists.
     * 
     * @return if the statuses_count attribute exists
     */
    public boolean isStatusesCountDefined() {
        return attributes.get(TwitterProfileDefinition.STATUSES_COUNT) != null;
    }
    
    public String getTimeZone() {
        return (String) attributes.get(TwitterProfileDefinition.TIME_ZONE);
    }
    
    public String getUrl() {
        return (String) attributes.get(TwitterProfileDefinition.URL);
    }
    
    public int getUtcOffset() {
        return getSafeInteger((Integer) attributes.get(TwitterProfileDefinition.UTC_OFFSET));
    }
    
    /**
     * Indicate if the utf_offset attribute exists.
     * 
     * @return if the utf_offset attribute exists
     */
    public boolean isUtcOffsetDefined() {
        return attributes.get(TwitterProfileDefinition.UTC_OFFSET) != null;
    }
    
    public boolean isVerified() {
        return getSafeBoolean((Boolean) attributes.get(TwitterProfileDefinition.VERIFIED));
    }
    
    /**
     * Indicate if the verified attribute exists.
     * 
     * @return if the verified attribute exists
     */
    public boolean isVerifiedDefined() {
        return attributes.get(TwitterProfileDefinition.VERIFIED) != null;
    }
}
