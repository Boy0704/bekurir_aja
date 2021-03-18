package com.boyride.pelanggan.utils.api.service;

import com.boyride.pelanggan.json.CheckStatusTransRequest;
import com.boyride.pelanggan.json.CheckStatusTransResponse;
import com.boyride.pelanggan.json.DetailRequestJson;
import com.boyride.pelanggan.json.DetailTransResponseJson;
import com.boyride.pelanggan.json.GetNearRideCarRequestJson;
import com.boyride.pelanggan.json.GetNearRideCarResponseJson;
import com.boyride.pelanggan.json.ItemRequestJson;
import com.boyride.pelanggan.json.LocationDriverRequest;
import com.boyride.pelanggan.json.LocationDriverResponse;
import com.boyride.pelanggan.json.RideCarRequestJson;
import com.boyride.pelanggan.json.RideCarResponseJson;
import com.boyride.pelanggan.json.SendRequestJson;
import com.boyride.pelanggan.json.SendResponseJson;
import com.boyride.pelanggan.json.fcm.CancelBookRequestJson;
import com.boyride.pelanggan.json.fcm.CancelBookResponseJson;


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
