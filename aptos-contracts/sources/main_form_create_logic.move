module aptos_forms_demo::main_form_create_logic {
    use aptos_forms_demo::main_form;
    use aptos_forms_demo::main_form_created;
    use std::string::String;
    use xrender_form_utils::string_range::StringRange;

    friend aptos_forms_demo::main_form_aggregate;

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
    ): main_form::MainFormCreated {
        let signer_address = std::signer::address_of(account);
        main_form::asset_main_form_not_exists(signer_address);
        main_form::new_main_form_created(
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
        main_form_created: &main_form::MainFormCreated,
    ): main_form::MainForm {
        let signer_address = main_form_created::signer_address(main_form_created);
        let fr_5pqi = main_form_created::fr_5pqi(main_form_created);
        let fr_duif = main_form_created::fr_duif(main_form_created);
        let fr_6i34 = main_form_created::fr_6i34(main_form_created);
        let fr_8xjs = main_form_created::fr_8xjs(main_form_created);
        let fr_9c3f = main_form_created::fr_9c3f(main_form_created);
        let fr_4ok6 = main_form_created::fr_4ok6(main_form_created);
        let fr_b3ub = main_form_created::fr_b3ub(main_form_created);
        let fr_1z7o = main_form_created::fr_1z7o(main_form_created);
        let fr_d8rw = main_form_created::fr_d8rw(main_form_created);
        let fr_dy3l = main_form_created::fr_dy3l(main_form_created);
        let fr_6f68 = main_form_created::fr_6f68(main_form_created);
        let fr_47yy = main_form_created::fr_47yy(main_form_created);
        let fr_gh3o = main_form_created::fr_gh3o(main_form_created);
        let fr_fbba = main_form_created::fr_fbba(main_form_created);
        let fr_hhzp = main_form_created::fr_hhzp(main_form_created);
        let single_text1 = main_form_created::single_text1(main_form_created);
        main_form::create_main_form(
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
