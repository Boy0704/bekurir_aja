package com.bekurir.app.utils.api.service;

import com.bekurir.app.json.AllMerchantByNearResponseJson;
import com.bekurir.app.json.AllMerchantbyCatRequestJson;
import com.bekurir.app.json.AllTransResponseJson;
import com.bekurir.app.json.BankResponseJson;
import com.bekurir.app.json.NewsDetailRequestJson;
import com.bekurir.app.json.NewsDetailResponseJson;
import com.bekurir.app.json.ChangePassRequestJson;
import com.bekurir.app.json.DetailRequestJson;
import com.bekurir.app.json.EditprofileRequestJson;
import com.bekurir.app.json.GetAllMerchantbyCatRequestJson;
import com.bekurir.app.json.GetServiceResponseJson;
import com.bekurir.app.json.GetHomeRequestJson;
import com.bekurir.app.json.GetHomeResponseJson;
import com.bekurir.app.json.GetMerchantbyCatRequestJson;
import com.bekurir.app.json.LoginRequestJson;
import com.bekurir.app.json.LoginResponseJson;
import com.bekurir.app.json.MerchantByCatResponseJson;
import com.bekurir.app.json.MerchantByIdResponseJson;
import com.bekurir.app.json.MerchantByNearResponseJson;
import com.bekurir.app.json.MerchantbyIdRequestJson;
import com.bekurir.app.json.PrivacyRequestJson;
import com.bekurir.app.json.PrivacyResponseJson;
import com.bekurir.app.json.PromoRequestJson;
import com.bekurir.app.json.PromoResponseJson;
import com.bekurir.app.json.RateRequestJson;
import com.bekurir.app.json.RateResponseJson;
import com.bekurir.app.json.RegisterRequestJson;
import com.bekurir.app.json.RegisterResponseJson;
import com.bekurir.app.json.ResponseJson;
import com.bekurir.app.json.SearchMerchantbyCatRequestJson;
import com.bekurir.app.json.StripeRequestJson;
import com.bekurir.app.json.TopupRequestJson;
import com.bekurir.app.json.TopupResponseJson;
import com.bekurir.app.json.WalletRequestJson;
import com.bekurir.app.json.WalletResponseJson;
import com.bekurir.app.json.WithdrawRequestJson;

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
