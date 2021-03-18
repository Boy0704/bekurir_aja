package com.boyride.pelanggan.utils.api.service;

import com.boyride.pelanggan.json.AllMerchantByNearResponseJson;
import com.boyride.pelanggan.json.AllMerchantbyCatRequestJson;
import com.boyride.pelanggan.json.AllTransResponseJson;
import com.boyride.pelanggan.json.BankResponseJson;
import com.boyride.pelanggan.json.NewsDetailRequestJson;
import com.boyride.pelanggan.json.NewsDetailResponseJson;
import com.boyride.pelanggan.json.ChangePassRequestJson;
import com.boyride.pelanggan.json.DetailRequestJson;
import com.boyride.pelanggan.json.EditprofileRequestJson;
import com.boyride.pelanggan.json.GetAllMerchantbyCatRequestJson;
import com.boyride.pelanggan.json.GetServiceResponseJson;
import com.boyride.pelanggan.json.GetHomeRequestJson;
import com.boyride.pelanggan.json.GetHomeResponseJson;
import com.boyride.pelanggan.json.GetMerchantbyCatRequestJson;
import com.boyride.pelanggan.json.LoginRequestJson;
import com.boyride.pelanggan.json.LoginResponseJson;
import com.boyride.pelanggan.json.MerchantByCatResponseJson;
import com.boyride.pelanggan.json.MerchantByIdResponseJson;
import com.boyride.pelanggan.json.MerchantByNearResponseJson;
import com.boyride.pelanggan.json.MerchantbyIdRequestJson;
import com.boyride.pelanggan.json.PrivacyRequestJson;
import com.boyride.pelanggan.json.PrivacyResponseJson;
import com.boyride.pelanggan.json.PromoRequestJson;
import com.boyride.pelanggan.json.PromoResponseJson;
import com.boyride.pelanggan.json.RateRequestJson;
import com.boyride.pelanggan.json.RateResponseJson;
import com.boyride.pelanggan.json.RegisterRequestJson;
import com.boyride.pelanggan.json.RegisterResponseJson;
import com.boyride.pelanggan.json.ResponseJson;
import com.boyride.pelanggan.json.SearchMerchantbyCatRequestJson;
import com.boyride.pelanggan.json.StripeRequestJson;
import com.boyride.pelanggan.json.TopupRequestJson;
import com.boyride.pelanggan.json.TopupResponseJson;
import com.boyride.pelanggan.json.WalletRequestJson;
import com.boyride.pelanggan.json.WalletResponseJson;
import com.boyride.pelanggan.json.WithdrawRequestJson;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Ourdevelops Team on 10/13/2019.
 */

public interface UserService {

    @POST("customerapi/login")
    Call<LoginResponseJson> login(@Body LoginRequestJson param);

    @POST("customerapi/kodepromo")
    Call<PromoResponseJson> promocode(@Body PromoRequestJson param);

    @POST("customerapi/listkodepromo")
    Call<PromoResponseJson> listpromocode(@Body PromoRequestJson param);

    @POST("customerapi/list_bank")
    Call<BankResponseJson> listbank(@Body WithdrawRequestJson param);

    @POST("customerapi/changepass")
    Call<LoginResponseJson> changepass(@Body ChangePassRequestJson param);

    @POST("customerapi/register_user")
    Call<RegisterResponseJson> register(@Body RegisterRequestJson param);

    @GET("customerapi/detail_fitur")
    Call<GetServiceResponseJson> getFitur();

    @POST("customerapi/forgot")
    Call<LoginResponseJson> forgot(@Body LoginRequestJson param);

    @POST("customerapi/privacy")
    Call<PrivacyResponseJson> privacy(@Body PrivacyRequestJson param);

    @POST("customerapi/home")
    Call<GetHomeResponseJson> home(@Body GetHomeRequestJson param);

    @POST("customerapi/topupstripe")
    Call<TopupResponseJson> topup(@Body TopupRequestJson param);

    @POST("customerapi/stripeaction")
    Call<ResponseJson> actionstripe(@Body StripeRequestJson param);

    @POST("customerapi/intentstripe")
    Call<ResponseJson> intentstripe(@Body StripeRequestJson param);

    @POST("customerapi/withdraw")
    Call<ResponseJson> withdraw(@Body WithdrawRequestJson param);

    @POST("customerapi/topuppaypal")
    Call<ResponseJson> topuppaypal(@Body WithdrawRequestJson param);

    @POST("customerapi/rate_driver")
    Call<RateResponseJson> rateDriver(@Body RateRequestJson param);

    @POST("customerapi/edit_profile")
    Call<RegisterResponseJson> editProfile(@Body EditprofileRequestJson param);

    @POST("customerapi/wallet")
    Call<WalletResponseJson> wallet(@Body WalletRequestJson param);

    @POST("customerapi/history_progress")
    Call<AllTransResponseJson> history(@Body DetailRequestJson param);

    @POST("customerapi/detail_berita")
    Call<NewsDetailResponseJson> beritadetail(@Body NewsDetailRequestJson param);

    @POST("customerapi/all_berita")
    Call<NewsDetailResponseJson> allberita(@Body NewsDetailRequestJson param);

    @POST("customerapi/merchantbykategoripromo")
    Call<MerchantByCatResponseJson> getmerchanbycat(@Body GetMerchantbyCatRequestJson param);

    @POST("customerapi/merchantbykategori")
    Call<MerchantByNearResponseJson> getmerchanbynear(@Body GetMerchantbyCatRequestJson param);

    @POST("customerapi/allmerchantbykategori")
    Call<AllMerchantByNearResponseJson> getallmerchanbynear(@Body GetAllMerchantbyCatRequestJson param);

    @POST("customerapi/itembykategori")
    Call<MerchantByIdResponseJson> getitembycat(@Body GetAllMerchantbyCatRequestJson param);

    @POST("customerapi/searchmerchant")
    Call<AllMerchantByNearResponseJson> searchmerchant(@Body SearchMerchantbyCatRequestJson param);

    @POST("customerapi/allmerchant")
    Call<AllMerchantByNearResponseJson> allmerchant(@Body AllMerchantbyCatRequestJson param);

    @POST("customerapi/merchantbyid")
    Call<MerchantByIdResponseJson> merchantbyid(@Body MerchantbyIdRequestJson param);


}
