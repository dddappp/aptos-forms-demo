module aptos_forms_demo::aptos_forms_demo_main_form_submit_logic {
    use aptos_forms_demo::aptos_forms_demo_main_form;
    use std::option::{Self, Option};
    use std::string::String;
    use xrender_form_utils::date::Date;
    use xrender_form_utils::date_range::DateRange;
    use xrender_form_utils::time_range::TimeRange;

    friend aptos_forms_demo::aptos_forms_demo_main_form_aggregate;

    const EFormNotOpen: u64 = 111;
    const EFormCutOff: u64 = 112;

    public(friend) fun verify(
        account: &signer,
        fr_5pqi: u128,
        fr_duif: vector<String>,
        fr_6i34: vector<String>,
        fr_8xjs: String,
        fr_9c3f: String,
        fr_4ok6: u128,
        fr_b3ub: String,
        fr_1z7o: u128,
        fr_d8rw: DateRange,
        fr_dy3l: Option<DateRange>,
        fr_6f68: u128,
        fr_47yy: TimeRange,
        fr_gh3o: Option<vector<String>>,
        fr_fbba: vector<String>,
        fr_hhzp: Date,
        single_text1: Option<String>,
        payment_123: u64,
    ): aptos_forms_demo_main_form::AptosFormsDemoMainFormSubmitted {
        let signer_address = std::signer::address_of(account);
        assert!(aptos_framework::timestamp::now_seconds() >= 1699256214, EFormNotOpen); // Open at: 2023-11-06T07:36:54Z
        assert!(aptos_framework::timestamp::now_seconds() <= 3908475414, EFormCutOff); // Cutoff at: 2093-11-08T07:36:54+08:00
        aptos_forms_demo_main_form::asset_aptos_forms_demo_main_form_not_exists(signer_address);
        aptos_forms_demo_main_form::new_aptos_forms_demo_main_form_submitted(
            signer_address,
            fr_5pqi,
            fr_duif,
            fr_6i34,
            fr_8xjs,
            fr_9c3f,
            fr_4ok6,
            fr_b3ub,
            fr_1z7o,
            fr_d8rw,
            fr_dy3l,
            fr_6f68,
            fr_47yy,
            fr_gh3o,
            fr_fbba,
            fr_hhzp,
            single_text1,
            payment_123,
        )
    }

    public(friend) fun mutate(
        _account: &signer,
        aptos_forms_demo_main_form_submitted: &aptos_forms_demo_main_form::AptosFormsDemoMainFormSubmitted,
    ): aptos_forms_demo_main_form::AptosFormsDemoMainForm {
        let signer_address = aptos_forms_demo_main_form::aptos_forms_demo_main_form_submitted_signer_address(aptos_forms_demo_main_form_submitted);
        let fr_5pqi = aptos_forms_demo_main_form::aptos_forms_demo_main_form_submitted_fr_5pqi(aptos_forms_demo_main_form_submitted);
        let fr_duif = aptos_forms_demo_main_form::aptos_forms_demo_main_form_submitted_fr_duif(aptos_forms_demo_main_form_submitted);
        let fr_6i34 = aptos_forms_demo_main_form::aptos_forms_demo_main_form_submitted_fr_6i34(aptos_forms_demo_main_form_submitted);
        let fr_8xjs = aptos_forms_demo_main_form::aptos_forms_demo_main_form_submitted_fr_8xjs(aptos_forms_demo_main_form_submitted);
        let fr_9c3f = aptos_forms_demo_main_form::aptos_forms_demo_main_form_submitted_fr_9c3f(aptos_forms_demo_main_form_submitted);
        let fr_4ok6 = aptos_forms_demo_main_form::aptos_forms_demo_main_form_submitted_fr_4ok6(aptos_forms_demo_main_form_submitted);
        let fr_b3ub = aptos_forms_demo_main_form::aptos_forms_demo_main_form_submitted_fr_b3ub(aptos_forms_demo_main_form_submitted);
        let fr_1z7o = aptos_forms_demo_main_form::aptos_forms_demo_main_form_submitted_fr_1z7o(aptos_forms_demo_main_form_submitted);
        let fr_d8rw = aptos_forms_demo_main_form::aptos_forms_demo_main_form_submitted_fr_d8rw(aptos_forms_demo_main_form_submitted);
        let fr_dy3l = aptos_forms_demo_main_form::aptos_forms_demo_main_form_submitted_fr_dy3l(aptos_forms_demo_main_form_submitted);
        let fr_6f68 = aptos_forms_demo_main_form::aptos_forms_demo_main_form_submitted_fr_6f68(aptos_forms_demo_main_form_submitted);
        let fr_47yy = aptos_forms_demo_main_form::aptos_forms_demo_main_form_submitted_fr_47yy(aptos_forms_demo_main_form_submitted);
        let fr_gh3o = aptos_forms_demo_main_form::aptos_forms_demo_main_form_submitted_fr_gh3o(aptos_forms_demo_main_form_submitted);
        let fr_fbba = aptos_forms_demo_main_form::aptos_forms_demo_main_form_submitted_fr_fbba(aptos_forms_demo_main_form_submitted);
        let fr_hhzp = aptos_forms_demo_main_form::aptos_forms_demo_main_form_submitted_fr_hhzp(aptos_forms_demo_main_form_submitted);
        let single_text1 = aptos_forms_demo_main_form::aptos_forms_demo_main_form_submitted_single_text1(aptos_forms_demo_main_form_submitted);
        let payment_123 = aptos_forms_demo_main_form::aptos_forms_demo_main_form_submitted_payment_123(aptos_forms_demo_main_form_submitted);
        let withdrawn_payment_123 = aptos_framework::coin::withdraw<aptos_framework::aptos_coin::AptosCoin>(_account, payment_123);
        aptos_forms_demo::aptos_forms_demo_global_aggregate::deposit_payment_123_vault(_account, withdrawn_payment_123);
        let aptos_forms_demo_main_form = aptos_forms_demo_main_form::create_aptos_forms_demo_main_form(
            signer_address,
            fr_5pqi,
            fr_duif,
            fr_6i34,
            fr_8xjs,
            fr_9c3f,
            fr_4ok6,
            fr_b3ub,
            fr_1z7o,
            fr_d8rw,
            fr_dy3l,
            fr_6f68,
            fr_47yy,
            fr_gh3o,
            fr_fbba,
            fr_hhzp,
            single_text1,
            payment_123,
        );
        aptos_forms_demo_main_form
    }

}
