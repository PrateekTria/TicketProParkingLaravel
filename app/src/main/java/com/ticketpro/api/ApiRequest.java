package com.ticketpro.api;

import com.ticketpro.model.ActivityRequest_Rpc;
import com.ticketpro.model.ArrayOfEnforcementZone;
import com.ticketpro.model.ArrayOfPlaveSearch;
import com.ticketpro.model.ArrayOfValidParkingData;
import com.ticketpro.model.BodyResponse;
import com.ticketpro.model.CallInListResponse;
import com.ticketpro.model.ClientInfoResponse;
import com.ticketpro.model.ColorResponse;
import com.ticketpro.model.CommentGroupCommentResponse;
import com.ticketpro.model.CommentGroupResponse;
import com.ticketpro.model.CommentResponse;
import com.ticketpro.model.ContactResponse;
import com.ticketpro.model.CustomerModuleResponse;
import com.ticketpro.model.CustomerResponse;
import com.ticketpro.model.DeviceGroupResponse;
import com.ticketpro.model.DeviceInfoResponse;
import com.ticketpro.model.DirectionResponse;
import com.ticketpro.model.DurationResponse;
import com.ticketpro.model.DutyResponse;
import com.ticketpro.model.EulaAcceptanceRequest_Rpc;
import com.ticketpro.model.EulaAcceptanceResult;
import com.ticketpro.model.EulaResult;
import com.ticketpro.model.EulaReuest_Rpc;
import com.ticketpro.model.FeatureResponse;
import com.ticketpro.model.FirebaseModel;
import com.ticketpro.model.FirebaseResponse;
import com.ticketpro.model.GPSLocationResponse;
import com.ticketpro.model.GenetecPatrollerActivitiesResponse;
import com.ticketpro.model.GeocodeLocation;
import com.ticketpro.model.HotList_Rpc;
import com.ticketpro.model.HotlistResponse;
import com.ticketpro.model.LocationGroupLocationResponse;
import com.ticketpro.model.LocationGroupResponse;
import com.ticketpro.model.LocationResponse;
import com.ticketpro.model.LotwiseApi;
import com.ticketpro.model.LprBodyResponse;
import com.ticketpro.model.MakeAndModelResponse;
import com.ticketpro.model.MessageResponse;
import com.ticketpro.model.MeterReponse;
import com.ticketpro.model.MeterRequest_Rpc;
import com.ticketpro.model.MeterResponse;
import com.ticketpro.model.ModuleResponse;
import com.ticketpro.model.PatrollersResponse;
import com.ticketpro.model.PermitRequest_Rpc;
import com.ticketpro.model.PermitResponse;
import com.ticketpro.model.PrintMacroResponse;
import com.ticketpro.model.PrintTemplateResponse;
import com.ticketpro.model.RepeatOffenderResponse;
import com.ticketpro.model.RepeatOffender_Rpc;
import com.ticketpro.model.RepeatOffendersLive_Rpc;
import com.ticketpro.model.RequestPOJO;
import com.ticketpro.model.RequestPOJODeviceFeatures;
import com.ticketpro.model.SearchVinResponse;
import com.ticketpro.model.SpecialActivitiesLocationResponse;
import com.ticketpro.model.SpecialActivityDispositionResponse;
import com.ticketpro.model.SpecialActivityReportResponse;
import com.ticketpro.model.SpecialActivityReport_Rpc;
import com.ticketpro.model.SpecialActivityResponse;
import com.ticketpro.model.StateResponse;
import com.ticketpro.model.StreetPrefixResponse;
import com.ticketpro.model.StreetSuffixResponse;
import com.ticketpro.model.TicketComment_Rpc;
import com.ticketpro.model.TicketHistoryResponse;
import com.ticketpro.model.TicketPicture_Rpc;
import com.ticketpro.model.TicketResponse;
import com.ticketpro.model.TicketViolationResponse;
import com.ticketpro.model.TicketViolation_Rpc;
import com.ticketpro.model.TicketsResponse;
import com.ticketpro.model.TokenBody;
import com.ticketpro.model.TokenResponse;
import com.ticketpro.model.UserResponse;
import com.ticketpro.model.UserSettingResponse;
import com.ticketpro.model.ValidResult;
import com.ticketpro.model.ValidTicketRequest_Rpc;
import com.ticketpro.model.VendorItemResponse;
import com.ticketpro.model.VendorResponse;
import com.ticketpro.model.VendorServiceRegistrationResponse;
import com.ticketpro.model.VendorServiceResponse;
import com.ticketpro.model.VerifyAndSyncTicketsResponse;
import com.ticketpro.model.VersionUpdateResponse;
import com.ticketpro.model.ViolationGroupResponse;
import com.ticketpro.model.ViolationGroupViolationResponse;
import com.ticketpro.model.ViolationResponse;
import com.ticketpro.model.VoidTicketReasonResponse;
import com.ticketpro.model.ZoneResponse;
import com.ticketpro.model.chalk_response.ChalkResponse;
import com.ticketpro.model.devicefeature.ResponseResult;
import com.ticketpro.syncbackup.synmodels.CSVinfo_Json_rpc;
import com.ticketpro.syncbackup.synmodels.Dbinfo_Json_rpc;
import com.ticketpro.syncbackup.synmodels.SyncBackup_Json_rpc;
import com.ticketpro.syncbackup.synmodels.UploadDebugResponse;
import com.ticketpro.vendors.ParkMobileSpace;
import com.ticketpro.vendors.ParkMobileZoneList;
import com.ticketpro.vendors.cbt_model.CubTracZone;
import com.ticketpro.vendors.cbt_model.CubtracResponse;
import com.ticketpro.vendors.passport2_model.Passport2Array;
import com.ticketpro.vendors.passport2_model.TokenRequest;
import com.ticketpro.vendors.passport2_model.PlateResponse;
import com.ticketpro.vendors.cbt_model.CubtracRequest;

import java.util.List;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * Created by SANJIV on 14-06-2020.
 */





// All Api endpoint is changed by Prateek 15/03/2024
public interface ApiRequest {


    @GET

    @Multipart
    @POST("/uploadfile")
    Observable<ResponseBody> updateProfile(@Part("custId") RequestBody id,
                                           @Part("full_name") RequestBody fullName,
                                           @Part MultipartBody.Part image);

    /**

     * @return
     */

    @POST("/v3/shared/access-tokens")
    Call<com.ticketpro.vendors.passport2_model.TokenResponse> getTokenForPassportParking2(@Body TokenRequest tokenBody);
    @GET
    Call<Passport2Array> getPP2Space(@Url String url);

    @GET
    Call<ParkMobileZoneList> getZoneParkMobile(@Url String url);

    @POST()
    Call<List<CubtracResponse>> cubtracPlatelookup(@Url String url, @Header("Authorization") String authToken, @Body CubtracRequest user);
    @GET()
    Call<List<CubTracZone>> cubtracGetZone(@Url String url, @Header("Authorization") String authToken);


    /**
     * @param url
     * @return
     */
    @GET
    Call<ParkMobileSpace> getParkMobileSingleSpace(@Url String url);

    @GET
    Call<ArrayOfEnforcementZone> getZone(@Url String url);

    @POST
    Call<ResponseBody> getPhotoAlpr(@Url String url, @Body String image);

    @GET
    Call<ArrayOfPlaveSearch> _serchPlate(@Url String url);

    @GET
    Call<ArrayOfValidParkingData> _serchPlate2(@Url String url);

    @GET
    Call<PlateResponse> getPP2PlateInfo(@Url String url);

    //CALE
    @GET
    Observable<ArrayOfValidParkingData> _searchPlateCALEWithoutZero(@Url String url);

    @GET
    Observable<ArrayOfValidParkingData> _searchPlateCALEWithZero(@Url String url);

    @GET
    Call<ArrayOfValidParkingData> _validateParking(@Url String url);

    @GET("/token")
    Call<ResponseBody> getAccessToken();

    @GET
    Call<LotwiseApi> _getDataBylotname(@Url String url);

    @GET("/parkingsummary/{Lotname}")
    Call<LotwiseApi> getDataBylotname(@Header("Authorization") String token, @Path("Lotname") String LotName);

    @GET("parkingsummary/{purchasedate}/{expirydate}")
    Call<LotwiseApi> getdatabydate(@Header("Authorization") String token, @Path("purchasedate") String purchasedate, @Path("expirydate") String expirydate);

    @GET("parkingsummary/{Lotname}/{purchasedate}/{expirydate}")
    Call<LotwiseApi> getdata_by_date_nd_lot(@Header("Authorization") String token, @Path("Lotname") String LotName, @Path("purchasedate") String purchasedate, @Path("expirydate") String expirydate);

    @POST("Tracking/AddDeviceInfo/")
    Call<FirebaseResponse> postDatatoFBDB(@Body FirebaseModel firebaseModel);

    @GET("json")
    Call<GeocodeLocation> getAddressfromLatLng(@Query("latlng") String latlng, @Query("key") String key);

    @POST("Authentication/GetToken/")
    Call<TokenResponse> getToken(@Body TokenBody tokenBody);

//    @POST("service/genericv1")
//    Observable<CustomerResponse> getCustomers(@Body RequestPOJO jbj);

    @POST("v1/common/getCustomers")
    Observable<CustomerResponse> getCustomers(@Body RequestPOJO jbj);

    //    @POST("service/genericv1")
//    Observable<ClientInfoResponse> getClientInfo(@Body RequestPOJO jbj);
    @POST("v1/common/getClientInfo")
    Observable<ClientInfoResponse> getClientInfo(@Body RequestPOJO jbj);


//    @POST("service/genericv1")
//    Observable<DeviceInfoResponse> getDeviceInfo(@Body RequestPOJO jbj);

    @POST("v1/parking/getDeviceInfo")
    Observable<DeviceInfoResponse> getDeviceInfo(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Call<UserResponse> getUsers(@Body RequestPOJO jbj);

    @POST("v1/common/getUsers")
    Call<UserResponse> getUsers(@Body RequestPOJO jbj);

    @POST("v1/common/getUsers")
    Call<UserResponse> getUsers1(@Body RequestPOJO jbj);

    @POST("v1/parking/updateGCMRegistrationId")
    Call<ResponseBody> updateGCMRegistrationID(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Call<GenetecPatrollerActivitiesResponse> updatePatrollerActivities(@Body RequestPOJO jbj);
//
//    @POST("service/genericv1")
//    Call<PatrollersResponse> getPatrollersId(@Body RequestPOJO jbj);

    //    @POST("service/genericv1")
//    Observable<UserSettingResponse> getUserSettings(@Body RequestPOJO jbj);
    @POST("v1/common/getUserSettings")
    Observable<UserSettingResponse> getUserSettings(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<MessageResponse> getMessages(@Body RequestPOJO jbj);

    @POST("v1/common/getMessages")
    Observable<MessageResponse> getMessages(@Body RequestPOJO jbj);

    //    @POST("service/genericv1")
//    Observable<BodyResponse> getBodies(@Body RequestPOJO jbj);
    @POST("v1/common/getBodies")
    Observable<BodyResponse> getBodies(@Body RequestPOJO jbj);

    //    @POST("service/genericv1")
//    Observable<LprBodyResponse> getLPRBodies(@Body RequestPOJO jbj);
    @POST("v1/common/getLprBodyMap")
    Observable<LprBodyResponse> getLPRBodies(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<ContactResponse> getContacts(@Body RequestPOJO jbj);

    @POST("v1/common/getContacts")
    Observable<ContactResponse> getContacts(@Body RequestPOJO jbj);

    //    @POST("service/genericv1")
//    Observable<ColorResponse> getColors(@Body RequestPOJO jbj);
    @POST("v1/common/getColors")
    Observable<ColorResponse> getColors(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<CommentResponse> getComments(@Body RequestPOJO jbj);

    @POST("v1/common/getComments")
    Observable<CommentResponse> getComments(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<DirectionResponse> getDirections(@Body RequestPOJO jbj);

    @POST("v1/common/getDirections")
    Observable<DirectionResponse> getDirections(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<DurationResponse> getDurations(@Body RequestPOJO jbj);

    @POST("v1/common/getDurations")
    Observable<DurationResponse> getDurations(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<DutyResponse> getDuties(@Body RequestPOJO jbj);

    @POST("v1/common/getDuties")
    Observable<DutyResponse> getDuties(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<FeatureResponse> getFeatures(@Body RequestPOJO jbj);

    @POST("v1/common/getFeatures")
    Observable<FeatureResponse> getFeatures(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<GPSLocationResponse> getGPSLocations(@Body RequestPOJO jbj);

    @POST("v1/common/getGPSLocations")
    Observable<GPSLocationResponse> getGPSLocations(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<SpecialActivitiesLocationResponse> getSpecialActivitiesLocation(@Body RequestPOJO jbj);

    @POST("v1/common/getSpecialActivitiesLocation")
    Observable<SpecialActivitiesLocationResponse> getSpecialActivitiesLocation(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<HotlistResponse> getHotlist(@Body RequestPOJO jbj);

    @POST("v1/common/getHotlist")
    Observable<HotlistResponse> getHotlist(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<LocationResponse> getLocations(@Body RequestPOJO jbj);

    @POST("v1/common/getLocations")
    Observable<LocationResponse> getLocations(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<RepeatOffenderResponse> getRepeatOffenders(@Body RequestPOJO jbj);

    @POST("v1/common/getRepeatOffenders")
    Observable<RepeatOffenderResponse> getRepeatOffenders(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<MakeAndModelResponse> getMakesAndModels(@Body RequestPOJO jbj);

    @POST("v1/common/getModelsAndMakes")
    Observable<MakeAndModelResponse> getMakesAndModels(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<MeterResponse> getMeters(@Body RequestPOJO jbj);

    @POST("v1/common/getMeters")
    Observable<MeterResponse> getMeters(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<PermitResponse> getPermits(@Body RequestPOJO jbj);

    @POST("v1/common/getPermits")
    Observable<PermitResponse> getPermits(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<StateResponse> getStates(@Body RequestPOJO jbj);

    @POST("v1/common/getStates")
    Observable<StateResponse> getStates(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<StreetPrefixResponse> getStreetPrefixes(@Body RequestPOJO jbj);

    @POST("v1/common/getStreetPrefixes")
    Observable<StreetPrefixResponse> getStreetPrefixes(@Body RequestPOJO jbj);

    //    @POST("service/genericv1")
//    Observable<StreetSuffixResponse> getStreetSuffixes(@Body RequestPOJO jbj);
    @POST("v1/common/getStreetSuffixes")
    Observable<StreetSuffixResponse> getStreetSuffixes(@Body RequestPOJO jbj);

    //    @POST("service/genericv1")
//    Observable<ViolationResponse> getViolations(@Body RequestPOJO jbj);
    @POST("v1/common/getViolations")
    Observable<ViolationResponse> getViolations(@Body RequestPOJO jbj);

    //    @POST("service/genericv1")
//    Observable<ZoneResponse> getZones(@Body RequestPOJO jbj);
    @POST("v1/common/getZones")
    Observable<ZoneResponse> getZones(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<DeviceGroupResponse> getDeviceGroup(@Body RequestPOJO jbj);

    @POST("v1/common/getDeviceGroup")
    Observable<DeviceGroupResponse> getDeviceGroup(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<VoidTicketReasonResponse> getVoidTicketReasons(@Body RequestPOJO jbj);

    @POST("v1/common/getVoidTicketReasons")
    Observable<VoidTicketReasonResponse> getVoidTicketReasons(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<SpecialActivityResponse> getSpecialActivities(@Body RequestPOJO jbj);

    @POST("v1/common/getSpecialActivities")
    Observable<SpecialActivityResponse> getSpecialActivities(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<SpecialActivityDispositionResponse> getSpecialActivityDispositions(@Body RequestPOJO jbj);

    @POST("v1/common/getSpecialActivityDispositions")
    Observable<SpecialActivityDispositionResponse> getSpecialActivityDispositions(@Body RequestPOJO jbj);


//    @POST("service/genericv1")
//    Observable<PrintMacroResponse> getPrintMacros(@Body RequestPOJO jbj);

    @POST("v1/common/getPrintMacros")
    Observable<PrintMacroResponse> getPrintMacros(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<PrintTemplateResponse> getPrintTemplates(@Body RequestPOJO jbj);

    @POST("v1/common/getPrintTemplates")
    Observable<PrintTemplateResponse> getPrintTemplates(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<CallInListResponse> getCallInList(@Body RequestPOJO jbj);

    @POST("v1/common/getCallInList")
    Observable<CallInListResponse> getCallInList(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<LocationGroupResponse> getLocationGroups(@Body RequestPOJO jbj);

    @POST("v1/common/getLocationGroups")
    Observable<LocationGroupResponse> getLocationGroups(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<LocationGroupLocationResponse> getLocationGroupLocations(@Body RequestPOJO jbj);

    @POST("v1/common/getLocationGroupLocations")
    Observable<LocationGroupLocationResponse> getLocationGroupLocations(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<CommentGroupResponse> getCommentGroups(@Body RequestPOJO jbj);

    @POST("v1/common/getCommentGroups")
    Observable<CommentGroupResponse> getCommentGroups(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<CommentGroupCommentResponse> getCommentGroupComments(@Body RequestPOJO jbj);

    @POST("v1/common/getCommentGroupComments")
    Observable<CommentGroupCommentResponse> getCommentGroupComments(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<ViolationGroupResponse> getViolationGroups(@Body RequestPOJO jbj);

    @POST("v1/common/getViolationGroups")
    Observable<ViolationGroupResponse> getViolationGroups(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<ViolationGroupViolationResponse> getViolationGroupViolations(@Body RequestPOJO jbj);


    @POST("v1/common/getViolationGroupViolations")
    Observable<ViolationGroupViolationResponse> getViolationGroupViolations(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<VendorResponse> getVendors(@Body RequestPOJO jbj);

    @POST("v1/common/getVendors")
    Observable<VendorResponse> getVendors(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<VendorServiceResponse> getVendorServices(@Body RequestPOJO jbj);

    @POST("v1/common/getVendorServices")
    Observable<VendorServiceResponse> getVendorServices(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<VendorItemResponse> getVendorItems(@Body RequestPOJO jbj);

    @POST("v1/common/getVendorItems")
    Observable<VendorItemResponse> getVendorItems(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<VendorServiceRegistrationResponse> getVendorServiceRegistrations(@Body RequestPOJO jbj);

    @POST("v1/common/getVendorServiceRegistrations")
    Observable<VendorServiceRegistrationResponse> getVendorServiceRegistrations(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<ModuleResponse> getModules(@Body RequestPOJO jbj);

    @POST("v1/common/getModules")
    Observable<ModuleResponse> getModules(@Body RequestPOJO jbj);

//    @POST("service/genericv1")
//    Observable<CustomerModuleResponse> getCustomerModules(@Body RequestPOJO jbj);

    @POST("v1/common/getCustomerModules")
    Observable<CustomerModuleResponse> getCustomerModules(@Body RequestPOJO jbj);

    @POST("v1/parking/updateTickets")
    Call<TicketResponse> syncTickets(@Body RequestPOJO pojo);

    @POST("v1/parking/updateDevices")
    Call<ResponseBody> syncDevices(@Body RequestPOJO pojo);

    @POST("v1/parking/sendEmail")
    Call<ResponseBody> sendEmail(@Body RequestPOJO pojo);

    @POST("v1/parking/updateChalkStatus")
    Call<ResponseBody> updateChalkStatus(@Body RequestPOJO pojo);

    @POST("v1/parking/updateErrorLog")
    Call<ResponseBody> sendErrorLogs(@Body RequestPOJO pojo);

    @POST("v1/parking/lastUpDateRepeatOffenders")
    Call<RepeatOffenderResponse> lastUpDateRepeatOffenders(@Body RequestPOJO pojo);

    @POST("v1/parking/getlastUpDateRepeatOffenders")
    Call<RepeatOffenderResponse> getlastRepeatOffenderService(@Body RequestPOJO pojo);

    @POST("v1/parking/updateChalks")
    Call<ChalkResponse> syncChalks(@Body RequestPOJO requestPOJO);

    @POST("v1/parking/searchPlates")
    Call<TicketsResponse> getPlateInfo(@Body RequestPOJO pojo);

    @POST("v1/parking/searchHotlist")
    Call<HotlistResponse> searchHotlist(@Body RequestPOJO pojo);

    @POST("v1/parking/searchPermitsByPlate")
    Call<PermitResponse> searchAllPermitByPlate(@Body RequestPOJO pojo);

    @POST("v1/parking/getVersionUpdates")
    Call<VersionUpdateResponse> getVersionUpdates(@Body RequestPOJO pojo);

    @POST("v1/parking/verifyAndSyncTickets")
    Call<VerifyAndSyncTicketsResponse> verifyAndSyncTickets(@Body RequestPOJO pojo);

    @POST("v1/parking/saveDeviceFeatures")
    Call<ResponseResult> saveDeviceFeatures1(@Body RequestPOJODeviceFeatures requestPOJO);

    @POST("v1/parking/updateMobileNowLog")
    Call<ResponseBody> updateMobileNowLog(@Body RequestPOJO pojo);

    @POST("v1/parking/updatedeviceid")
    Call<TicketResponse> updatedeviceid(@Body RequestPOJO pojo);

    @POST("v1/parking/updateDutyReports")
    Call<ResponseBody> updateDutyReport(@Body RequestPOJO pojo);

    @POST("v1/parking/getEula")
    Call<EulaResult> getEula(@Body EulaReuest_Rpc pojo);

    @POST("v1/parking/eulaAcceptance")
    Call<EulaAcceptanceResult> getEulaAcceptance(@Body EulaAcceptanceRequest_Rpc pojo);

    @POST("v1/parking/getValidTicket")
    Call<ValidResult> getValidTicket(@Body ValidTicketRequest_Rpc pojo);


    // This code is added by mohit 27/02/2023

    @POST("v1/parking/updateRepeatOffendersCount")
    Call<ResponseBody> updateRepeatOffendersCount(@Body RepeatOffender_Rpc pojo);

    @POST("v1/parking/getRepeatOffendersLive")
    Call<RepeatOffenderResponse> getRepeatOffendersLive(@Body RepeatOffendersLive_Rpc pojo);

    @POST("v1/parking/deleteTicketComments")
    Call<ResponseBody> deleteTicketComments(@Body RequestPOJO pojo);

    @POST("v1/parking/deleteTicketPicture")
    Call<ResponseBody> deleteTicketPicture(@Body RequestPOJO pojo);

    @POST("v1/parking/getTicketHistory")
    Call<TicketHistoryResponse> getTickeHistory(@Body RequestPOJO pojo);

    @POST("v1/parking/updateTicketComments")
    Call<ResponseBody> updateTicketComments(@Body TicketComment_Rpc pojo);


    @POST("v1/parking/getLicenseDetail")
    Call<ResponseBody> GetLicenseDetail(@Body RequestPOJO pojo);

    @POST("v1/parking/newHotlist")
    Call<ResponseBody> newHotlist(@Body HotList_Rpc pojo);

    @POST("v1/parking/updateSpecialActivityReports")
    Call<ResponseBody> updateSpecialActivityReports(@Body ActivityRequest_Rpc pojo);

    @POST("v1/parking/updateSpecialActivityPictures")
    Call<ResponseBody> updateSpecialActivityPictures(@Body ActivityRequest_Rpc pojo);

    @POST("v1/parking/getSpecialActivityReports")
    Call<SpecialActivityReportResponse> getSpecialActivityReports(@Body SpecialActivityReport_Rpc pojo);

    @POST("v1/parking/updateDutyReports")
    Call<ResponseBody> updateDutyReports(@Body ActivityRequest_Rpc pojo);

    @POST("v1/parking/updateHotListReports")
    Call<ResponseBody> updateHotListReports(@Body ActivityRequest_Rpc pojo);

    @POST("v1/parking/searchMeters")
    Call<MeterReponse> searchMeters(@Body MeterRequest_Rpc pojo);

    @POST("v1/parking/searchPermits")
    Call<PermitResponse> searchPermits(@Body PermitRequest_Rpc pojo);

    @POST("v1/parking/searchPermitVins")
    Call<PermitResponse> searchPermitVins(@Body PermitRequest_Rpc pojo);

    @POST("v1/parking/searchVins")
    Call<SearchVinResponse> searchVins(@Body PermitRequest_Rpc pojo);

    @POST("v1/parking/updateTicketPicture")
    Call<ResponseBody> updateTicketPicture(@Body TicketPicture_Rpc pojo);

    @POST("v1/parking/getTicketViolations")
    Call<TicketViolationResponse> getTicketViolations(@Body TicketViolation_Rpc pojo);

    @POST("v1/parking/uploadDebugLog")
    Call<UploadDebugResponse> uploadDebugLog(@Body SyncBackup_Json_rpc rpc);

    @POST("v1/parking/uploadDatabase")
    Call<UploadDebugResponse> uploadDbBackUp(@Body Dbinfo_Json_rpc rpc);

    @POST("v1/parking/uploadCsvInsideDiagnostics")
    Call<UploadDebugResponse> uploadCSVBackUp(@Body CSVinfo_Json_rpc rpc);

}

