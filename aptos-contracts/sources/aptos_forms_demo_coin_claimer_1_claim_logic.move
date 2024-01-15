module aptos_forms_demo::aptos_forms_demo_coin_claimer_1_claim_logic {
    use aptos_forms_demo::aptos_forms_demo_coin_claimer_1;

    friend aptos_forms_demo::aptos_forms_demo_coin_claimer_1_aggregate;

    const EFormNotSubmitted: u64 = 101;

    public(friend) fun verify(
        account: &signer,
    ): aptos_forms_demo_coin_claimer_1::AptosFormsDemoCoin_claimer_1_Claimed {
        assert!(aptos_forms_demo::aptos_forms_demo_main_form::contains_aptos_forms_demo_main_form(std::signer::address_of(account)), EFormNotSubmitted);
        let signer_address = std::signer::address_of(account);
        aptos_forms_demo_coin_claimer_1::asset_aptos_forms_demo_coin_claimer_1_not_exists(signer_address);
        aptos_forms_demo_coin_claimer_1::new_aptos_forms_demo_coin_claimer_1_claimed(
            signer_address,
        )
    }

    public(friend) fun mutate(
        _account: &signer,
        aptos_forms_demo_coin_claimer_1_claimed: &aptos_forms_demo_coin_claimer_1::AptosFormsDemoCoin_claimer_1_Claimed,
    ): aptos_forms_demo_coin_claimer_1::AptosFormsDemoCoinClaimer1 {
        let signer_address = aptos_forms_demo_coin_claimer_1::aptos_forms_demo_coin_claimer_1_claimed_signer_address(aptos_forms_demo_coin_claimer_1_claimed);
        let _global_obj = aptos_forms_demo::aptos_forms_demo_global::get_aptos_forms_demo_global();
        let _global = aptos_forms_demo::aptos_forms_demo_pass_object::borrow(&_global_obj);
        let totoal_amount = aptos_framework::coin::value(aptos_forms_demo::aptos_forms_demo_global::borrow_coin_claimer_1_vault(_global));
        let total_shares = aptos_forms_demo::aptos_forms_demo_global::coin_claimer_1_total_shares(_global);
        total_shares = total_shares - aptos_forms_demo::aptos_forms_demo_global::coin_claimer_1_claimed_count(_global);
        aptos_forms_demo::aptos_forms_demo_global::return_aptos_forms_demo_global(_global_obj);
        let max_shares = 3;
        let amount = xrender_form_utils::account_ts_random::random_amount(_account, totoal_amount, total_shares, max_shares, 1);
        let coin_withdrawn = aptos_forms_demo::aptos_forms_demo_global_aggregate::withdraw_coin_claimer_1_vault(_account, amount);
        aptos_framework::coin::deposit(std::signer::address_of(_account), coin_withdrawn);
        aptos_forms_demo_coin_claimer_1::create_aptos_forms_demo_coin_claimer_1(
            signer_address,
        )
    }

}
