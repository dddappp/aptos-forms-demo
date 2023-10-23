module aptos_forms_demo::aptos_forms_demo_main_form_submit_logic {
    use aptos_forms_demo::aptos_forms_demo_main_form;
    use aptos_forms_demo::aptos_forms_demo_main_form_submitted;
    use std::string::String;
    use xrender_form_utils::string_range::StringRange;

    friend aptos_forms_demo::aptos_forms_demo_main_form_aggregate;

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
        fr_d8rw: StringRange,
        fr_dy3l: StringRange,
        fr_6f68: u128,
        fr_47yy: StringRange,
        fr_gh3o: vector<String>,
        fr_fbba: vector<String>,
        fr_hhzp: String,
        single_text1: String,
    ): aptos_forms_demo_main_form::AptosFormsDemoMainFormSubmitted {
        let signer_address = std::signer::address_of(account);
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
        )
    }

    public(friend) fun mutate(
        _account: &signer,
        aptos_forms_demo_main_form_submitted: &aptos_forms_demo_main_form::AptosFormsDemoMainFormSubmitted,
    ): aptos_forms_demo_main_form::AptosFormsDemoMainForm {
        let signer_address = aptos_forms_demo_main_form_submitted::signer_address(aptos_forms_demo_main_form_submitted);
        let fr_5pqi = aptos_forms_demo_main_form_submitted::fr_5pqi(aptos_forms_demo_main_form_submitted);
        let fr_duif = aptos_forms_demo_main_form_submitted::fr_duif(aptos_forms_demo_main_form_submitted);
        let fr_6i34 = aptos_forms_demo_main_form_submitted::fr_6i34(aptos_forms_demo_main_form_submitted);
        let fr_8xjs = aptos_forms_demo_main_form_submitted::fr_8xjs(aptos_forms_demo_main_form_submitted);
        let fr_9c3f = aptos_forms_demo_main_form_submitted::fr_9c3f(aptos_forms_demo_main_form_submitted);
        let fr_4ok6 = aptos_forms_demo_main_form_submitted::fr_4ok6(aptos_forms_demo_main_form_submitted);
        let fr_b3ub = aptos_forms_demo_main_form_submitted::fr_b3ub(aptos_forms_demo_main_form_submitted);
        let fr_1z7o = aptos_forms_demo_main_form_submitted::fr_1z7o(aptos_forms_demo_main_form_submitted);
        let fr_d8rw = aptos_forms_demo_main_form_submitted::fr_d8rw(aptos_forms_demo_main_form_submitted);
        let fr_dy3l = aptos_forms_demo_main_form_submitted::fr_dy3l(aptos_forms_demo_main_form_submitted);
        let fr_6f68 = aptos_forms_demo_main_form_submitted::fr_6f68(aptos_forms_demo_main_form_submitted);
        let fr_47yy = aptos_forms_demo_main_form_submitted::fr_47yy(aptos_forms_demo_main_form_submitted);
        let fr_gh3o = aptos_forms_demo_main_form_submitted::fr_gh3o(aptos_forms_demo_main_form_submitted);
        let fr_fbba = aptos_forms_demo_main_form_submitted::fr_fbba(aptos_forms_demo_main_form_submitted);
        let fr_hhzp = aptos_forms_demo_main_form_submitted::fr_hhzp(aptos_forms_demo_main_form_submitted);
        let single_text1 = aptos_forms_demo_main_form_submitted::single_text1(aptos_forms_demo_main_form_submitted);
        aptos_forms_demo_main_form::create_aptos_forms_demo_main_form(
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
        )
    }

}
