package com.xseillier.psnapi.model.param;

import com.xseillier.psnapi.model.enumeration.ImageSizeEnum;
import com.xseillier.psnapi.model.param.enumeration.FriendStatusEnum;
import com.xseillier.psnapi.model.param.enumeration.ProfileOptionEnum;

/**
 *
 * @author xseillier
 * @version 1.0 1 oct. 2015
 */
public class ProfileParamFactory {

	public static final int SIMPLE_PROFILE         = 1;
	public static final int FULL_PROFILE           = 2;
	public static final int BLOKED_LIST_PROFILE    = 3;
	public static final int FRIEND_SEND_REQUEST    = 4;
	public static final int FRIEND_RECEIVE_REQUEST = 5;
	
	public static ProfileParam create( int aType ) {
		
		switch( aType ) {
			case SIMPLE_PROFILE         : return createSimpleProfile();
			case FULL_PROFILE           : return createFullProfile();
			case BLOKED_LIST_PROFILE    : return createBlokedListProfile();
			case FRIEND_SEND_REQUEST    : return createFriendSendRequestProfile();
			case FRIEND_RECEIVE_REQUEST : return createFriendReceiveRequestProfile();
			default:
				throw new IllegalArgumentException("Type unknown");
		}
	}
	
	
	/**
	 * create simple profile param
	 * @return
	 */
	private static ProfileParam createSimpleProfile() {
		return new ProfileParam.ProfileParamBuilder().addProfileOption(ProfileOptionEnum.ONLINE_ID).setFriendStatus( FriendStatusEnum.FRIEND).build();
	}
	
	
	/**
	 * create full profile param
	 * @return
	 */
	private static ProfileParam createFullProfile() {
		
		return new ProfileParam.ProfileParamBuilder()
		           .addProfileOption(ProfileOptionEnum.ONLINE_ID)
		           .addProfileOption(ProfileOptionEnum.ABOUT_ME)
		           .addProfileOption(ProfileOptionEnum.LANGUAGES_USED)
		           .addProfileOption(ProfileOptionEnum.PLUS)
		           .addProfileOption(ProfileOptionEnum.PERSONAL_DETAIL)
		           .addProfileOption(ProfileOptionEnum.AVATAR_URLS)
		           .addProfileOption(ProfileOptionEnum.PRESENCE)
		           .addProfileOption(ProfileOptionEnum.IS_OFFICIALLY_VERIFIED)
		           .addProfileOption(ProfileOptionEnum.RELATION )
		           .addProfileOption(ProfileOptionEnum.REQUEST_MESSAGE_FLAG)
		           .addProfileOption(ProfileOptionEnum.TROPHY_SUMMARY)
		           .addProfileOption(ProfileOptionEnum.NP_TITLE_ICON_URL)
		           .addProfileOption(ProfileOptionEnum.MUTUAL_FRIENDS_COUNT)
		           .setFriendStatus( FriendStatusEnum.FRIEND)
		           .addImageSize(ImageSizeEnum.LARGE).build();
		
	}
	
	
	/**
	 * create blocked list profile param
	 * @return
	 */
	private static ProfileParam createBlokedListProfile() {
		return new ProfileParam.ProfileParamBuilder()
		.addProfileOption(ProfileOptionEnum.DEFAULT)
		.addProfileOption(ProfileOptionEnum.PROFILE)
		.addProfileOption(ProfileOptionEnum.AVATAR_URLS)         
		.addImageSize( ImageSizeEnum.LARGE)
		.build();
	}
	
	
	private static ProfileParam createFriendSendRequestProfile() {
		return new ProfileParam.ProfileParamBuilder()
		.addProfileOption(ProfileOptionEnum.AVATAR_URLS)       
		.addProfileOption(ProfileOptionEnum.PLUS)
        .addProfileOption(ProfileOptionEnum.PERSONAL_DETAIL)
        .addProfileOption(ProfileOptionEnum.PERSONAL_DETAIL_DISPLAY_NAME )
        .addProfileOption(ProfileOptionEnum.RELATION )
        .addProfileOption(ProfileOptionEnum.PRESENCE )
        .addProfileOption(ProfileOptionEnum.TROPHY_SUMMARY)
        .addProfileOption(ProfileOptionEnum.IS_OFFICIALLY_VERIFIED)
        .addProfileOption(ProfileOptionEnum.REQUESTED_DATE)
        .addImageSize(ImageSizeEnum.LARGE).build();

	}
	
	
	private static ProfileParam createFriendReceiveRequestProfile() {
		return new ProfileParam.ProfileParamBuilder()
		.addProfileOption(ProfileOptionEnum.AVATAR_URLS)       
		.addProfileOption(ProfileOptionEnum.PLUS)
        .addProfileOption(ProfileOptionEnum.PERSONAL_DETAIL)
        .addProfileOption(ProfileOptionEnum.PERSONAL_DETAIL_DISPLAY_NAME )
        .addProfileOption(ProfileOptionEnum.RELATION )
        .addProfileOption(ProfileOptionEnum.PRESENCE )
        .addProfileOption(ProfileOptionEnum.TROPHY_SUMMARY)
        .addProfileOption(ProfileOptionEnum.IS_OFFICIALLY_VERIFIED)
        .addProfileOption(ProfileOptionEnum.REQUESTED_DATE)
        .addImageSize(ImageSizeEnum.LARGE).build();

	}
}
