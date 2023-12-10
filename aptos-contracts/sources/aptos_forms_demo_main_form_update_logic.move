module aptos_forms_demo::aptos_forms_demo_main_form_update_logic {
    use aptos_forms_demo::aptos_forms_demo_main_form;
    use std::string::String;
    use xrender_form_utils::date::Date;
    use xrender_form_utils::date_range::DateRange;
    use xrender_form_utils::time_range::TimeRange;

    friend aptos_forms_demo::aptos_forms_demo_main_form_aggregate;

    const EFormNotOpen: u64 = 111;
    const EFormCutOff: u64 = 112;
    const ENoUpdatePermission: u64 = 113;
    const EFieldNotUpdatable: u64 = 114;

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
        fr_dy3l: DateRange,
        fr_6f68: u128,
        fr_47yy: TimeRange,
        fr_gh3o: vector<String>,
        fr_fbba: vector<String>,
        fr_hhzp: Date,
        single_text1: String,
        payment_123: u64,
        aptos_forms_demo_main_form: &aptos_forms_demo_main_form::AptosFormsDemoMainForm,
    ): aptos_forms_demo_main_form::AptosFormsDemoMainFormUpdated {
        let _ = account;
        assert!(aptos_forms_demo_main_form::signer_address(aptos_forms_demo_main_form) == std::signer::address_of(account), ENoUpdatePermission);
        //assert!(payment_123 == aptos_forms_demo_main_form::payment_123(aptos_forms_demo_main_form), EFieldNotUpdatable);
        let old_payment_123 = aptos_forms_demo_main_form::payment_123(aptos_forms_demo_main_form);
        assert!(aptos_framework::timestamp::now_seconds() >= 1699256214, EFormNotOpen); // Open at: 2023-11-06T07:36:54Z
        assert!(aptos_framework::timestamp::now_seconds() <= 3908475414, EFormCutOff); // Cutoff at: 2093-11-08T07:36:54+08:00
        aptos_forms_demo_main_form::new_aptos_forms_demo_main_form_updated(
            aptos_forms_demo_main_form,
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
            if (payment_123 > old_payment_123) { payment_123 - old_payment_123 } else { 0 },
            if (payment_123 < old_payment_123) { old_payment_123 - payment_123 } else { 0 },
        )
    }

    public(friend) fun mutate(
        _account: &signer,
        aptos_forms_demo_main_form_updated: &aptos_forms_demo_main_form::AptosFormsDemoMainFormUpdated,
        aptos_forms_demo_main_form: aptos_forms_demo_main_form::AptosFormsDemoMainForm,
    ): aptos_forms_demo_main_form::AptosFormsDemoMainForm {
        let fr_5pqi = aptos_forms_demo_main_form::aptos_forms_demo_main_form_updated_fr_5pqi(aptos_forms_demo_main_form_updated);
        let fr_duif = aptos_forms_demo_main_form::aptos_forms_demo_main_form_updated_fr_duif(aptos_forms_demo_main_form_updated);
        let fr_6i34 = aptos_forms_demo_main_form::aptos_forms_demo_main_form_updated_fr_6i34(aptos_forms_demo_main_form_updated);
        let fr_8xjs = aptos_forms_demo_main_form::aptos_forms_demo_main_form_updated_fr_8xjs(aptos_forms_demo_main_form_updated);
        let fr_9c3f = aptos_forms_demo_main_form::aptos_forms_demo_main_form_updated_fr_9c3f(aptos_forms_demo_main_form_updated);
        let fr_4ok6 = aptos_forms_demo_main_form::aptos_forms_demo_main_form_updated_fr_4ok6(aptos_forms_demo_main_form_updated);
        let fr_b3ub = aptos_forms_demo_main_form::aptos_forms_demo_main_form_updated_fr_b3ub(aptos_forms_demo_main_form_updated);
        let fr_1z7o = aptos_forms_demo_main_form::aptos_forms_demo_main_form_updated_fr_1z7o(aptos_forms_demo_main_form_updated);
        let fr_d8rw = aptos_forms_demo_main_form::aptos_forms_demo_main_form_updated_fr_d8rw(aptos_forms_demo_main_form_updated);
        let fr_dy3l = aptos_forms_demo_main_form::aptos_forms_demo_main_form_updated_fr_dy3l(aptos_forms_demo_main_form_updated);
        let fr_6f68 = aptos_forms_demo_main_form::aptos_forms_demo_main_form_updated_fr_6f68(aptos_forms_demo_main_form_updated);
        let fr_47yy = aptos_forms_demo_main_form::aptos_forms_demo_main_form_updated_fr_47yy(aptos_forms_demo_main_form_updated);
        let fr_gh3o = aptos_forms_demo_main_form::aptos_forms_demo_main_form_updated_fr_gh3o(aptos_forms_demo_main_form_updated);
        let fr_fbba = aptos_forms_demo_main_form::aptos_forms_demo_main_form_updated_fr_fbba(aptos_forms_demo_main_form_updated);
        let fr_hhzp = aptos_forms_demo_main_form::aptos_forms_demo_main_form_updated_fr_hhzp(aptos_forms_demo_main_form_updated);
        let single_text1 = aptos_forms_demo_main_form::aptos_forms_demo_main_form_updated_single_text1(aptos_forms_demo_main_form_updated);
        let payment_123 = aptos_forms_demo_main_form::aptos_forms_demo_main_form_updated_payment_123(aptos_forms_demo_main_form_updated);
        let payment_123_supplement = aptos_forms_demo_main_form::aptos_forms_demo_main_form_updated_payment_123_supplement(aptos_forms_demo_main_form_updated);
        let payment_123_refund = aptos_forms_demo_main_form::aptos_forms_demo_main_form_updated_payment_123_refund(aptos_forms_demo_main_form_updated);
        let signer_address = aptos_forms_demo_main_form::signer_address(&aptos_forms_demo_main_form);
        if (payment_123_supplement > 0) {
            let withdrawn_payment_123_supplement = aptos_framework::coin::withdraw<aptos_framework::aptos_coin::AptosCoin>(_account, payment_123_supplement);
            aptos_forms_demo::aptos_forms_demo_global_aggregate::deposit_payment_123_vault(_account, withdrawn_payment_123_supplement);            
        } else if (payment_123_refund > 0) {
            let withdrawn_payment_123_refund = aptos_forms_demo::aptos_forms_demo_global_aggregate::withdraw_payment_123_vault(_account, payment_123_refund);            
            aptos_framework::coin::deposit(std::signer::address_of(_account), withdrawn_payment_123_refund);
        };
        let _ = signer_address;
        aptos_forms_demo_main_form::set_fr_5pqi(&mut aptos_forms_demo_main_form, fr_5pqi);
        aptos_forms_demo_main_form::set_fr_duif(&mut aptos_forms_demo_main_form, fr_duif);
        aptos_forms_demo_main_form::set_fr_6i34(&mut aptos_forms_demo_main_form, fr_6i34);
        aptos_forms_demo_main_form::set_fr_8xjs(&mut aptos_forms_demo_main_form, fr_8xjs);
        aptos_forms_demo_main_form::set_fr_9c3f(&mut aptos_forms_demo_main_form, fr_9c3f);
        aptos_forms_demo_main_form::set_fr_4ok6(&mut aptos_forms_demo_main_form, fr_4ok6);
        aptos_forms_demo_main_form::set_fr_b3ub(&mut aptos_forms_demo_main_form, fr_b3ub);
        aptos_forms_demo_main_form::set_fr_1z7o(&mut aptos_forms_demo_main_form, fr_1z7o);
        aptos_forms_demo_main_form::set_fr_d8rw(&mut aptos_forms_demo_main_form, fr_d8rw);
        aptos_forms_demo_main_form::set_fr_dy3l(&mut aptos_forms_demo_main_form, fr_dy3l);
        aptos_forms_demo_main_form::set_fr_6f68(&mut aptos_forms_demo_main_form, fr_6f68);
        aptos_forms_demo_main_form::set_fr_47yy(&mut aptos_forms_demo_main_form, fr_47yy);
        aptos_forms_demo_main_form::set_fr_gh3o(&mut aptos_forms_demo_main_form, fr_gh3o);
        aptos_forms_demo_main_form::set_fr_fbba(&mut aptos_forms_demo_main_form, fr_fbba);
        aptos_forms_demo_main_form::set_fr_hhzp(&mut aptos_forms_demo_main_form, fr_hhzp);
        aptos_forms_demo_main_form::set_single_text1(&mut aptos_forms_demo_main_form, single_text1);
        aptos_forms_demo_main_form::set_payment_123(&mut aptos_forms_demo_main_form, payment_123);
        aptos_forms_demo_main_form
    }

}
