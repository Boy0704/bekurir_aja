package com.bekurir.app.utils.api.service;

import com.bekurir.app.json.CheckStatusTransRequest;
import com.bekurir.app.json.CheckStatusTransResponse;
import com.bekurir.app.json.DetailRequestJson;
import com.bekurir.app.json.DetailTransResponseJson;
import com.bekurir.app.json.GetNearRideCarRequestJson;
import com.bekurir.app.json.GetNearRideCarResponseJson;
import com.bekurir.app.json.ItemRequestJson;
import com.bekurir.app.json.LocationDriverRequest;
import com.bekurir.app.json.LocationDriverResponse;
import com.bekurir.app.json.RideCarRequestJson;
import com.bekurir.app.json.RideCarResponseJson;
import com.bekurir.app.json.SendRequestJson;
import com.bekurir.app.json.SendResponseJson;
import com.bekurir.app.json.fcm.CancelBookRequestJson;
import com.bekurir.app.json.fcm.CancelBookResponseJson;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Ourdevelops Team on 10/17/2019.
 */

public interface BookService {

    @POST("customerapi/list_ride")
    Call<GetNearRideCarResponseJson> getNearRide(@Body GetNearRideCarRequestJson param);

    @POST("customerapi/list_car")
    Call<GetNearRideCarResponseJson> getNearCar(@Body GetNearRideCarRequestJson param);

    @POST("customerapi/request_transaksi")
    Call<RideCarResponseJson> requestTransaksi(@Body RideCarRequestJson param);

    @POST("customerapi/inserttransaksimerchant")
    Call<RideCarResponseJson> requestTransaksiMerchant(@Body ItemRequestJson param);

    @POST("customerapi/request_transaksi_send")
    Call<SendResponseJson> requestTransaksisend(@Body SendRequestJson param);

    @POST("customerapi/check_status_transaksi")
    Call<CheckStatusTransResponse> checkStatusTransaksi(@Body CheckStatusTransRequest param);

    @POST("customerapi/user_cancel")
    Call<CancelBookResponseJson> cancelOrder(@Body CancelBookRequestJson param);

    @POST("customerapi/liat_lokasi_driver")
    Call<LocationDriverResponse> liatLokasiDriver(@Body LocationDriverRequest param);

    @POST("customerapi/detail_transaksi")
    Call<DetailTransResponseJson> detailtrans(@Body DetailRequestJson param);


}
