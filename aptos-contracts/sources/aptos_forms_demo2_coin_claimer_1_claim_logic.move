module aptos_forms_demo::aptos_forms_demo2_coin_claimer_1_claim_logic {
    use aptos_forms_demo::aptos_forms_demo2_coin_claimer_1;

    friend aptos_forms_demo::aptos_forms_demo2_coin_claimer_1_aggregate;

    const EFormNotSubmitted: u64 = 101;
    const EInsufficientFunds: u64 = 102;
    const EAllSharesClaimed: u64 = 103;
    const EFormNotOpen: u64 = 111;
    const EFormCutOff: u64 = 112;

    public(friend) fun verify(
        account: &signer,
    ): aptos_forms_demo2_coin_claimer_1::AptosFormsDemo2Coin_claimer_1_Claimed {
        let signer_address = std::signer::address_of(account);
        assert!(aptos_framework::timestamp::now_seconds() >= 1699256214, EFormNotOpen); // Open at: 2023-11-06T07:36:54Z
        assert!(aptos_framework::timestamp::now_seconds() <= 3908475414, EFormCutOff); // Cutoff at: 2093-11-08T07:36:54+08:00
        let aptos_forms_demo2_global_obj = aptos_forms_demo::aptos_forms_demo2_global::get_aptos_forms_demo2_global();
        let aptos_forms_demo2_global = aptos_forms_demo::aptos_forms_demo2_pass_object::borrow(&aptos_forms_demo2_global_obj);
        let total_shares = aptos_forms_demo::aptos_forms_demo2_global::coin_claimer_1_total_shares(aptos_forms_demo2_global);
        let claimed_count = aptos_forms_demo::aptos_forms_demo2_global::coin_claimer_1_claimed_count(aptos_forms_demo2_global);
        assert!(total_shares > claimed_count, EAllSharesClaimed);
        let remaining_shares = total_shares - claimed_count;
        let remaining_amount = aptos_framework::coin::value(aptos_forms_demo::aptos_forms_demo2_global::borrow_coin_claimer_1_vault(aptos_forms_demo2_global));
        assert!(remaining_amount > 0, EInsufficientFunds);
        aptos_forms_demo::aptos_forms_demo2_global::return_aptos_forms_demo2_global(aptos_forms_demo2_global_obj);

        aptos_forms_demo2_coin_claimer_1::asset_aptos_forms_demo2_coin_claimer_1_not_exists(signer_address);
        aptos_forms_demo2_coin_claimer_1::new_aptos_forms_demo2_coin_claimer_1_claimed(
            signer_address,
            remaining_amount,
            remaining_shares,
        )
    }

    public(friend) fun mutate(
        _account: &signer,
        aptos_forms_demo2_coin_claimer_1_claimed: &aptos_forms_demo2_coin_claimer_1::AptosFormsDemo2Coin_claimer_1_Claimed,
    ): aptos_forms_demo2_coin_claimer_1::AptosFormsDemo2CoinClaimer1 {
        let signer_address = aptos_forms_demo2_coin_claimer_1::aptos_forms_demo2_coin_claimer_1_claimed_signer_address(aptos_forms_demo2_coin_claimer_1_claimed);
        let remaining_amount = aptos_forms_demo2_coin_claimer_1::aptos_forms_demo2_coin_claimer_1_claimed_remaining_amount(aptos_forms_demo2_coin_claimer_1_claimed);
        let remaining_shares = aptos_forms_demo2_coin_claimer_1::aptos_forms_demo2_coin_claimer_1_claimed_remaining_shares(aptos_forms_demo2_coin_claimer_1_claimed);
        let amount = remaining_amount / remaining_shares;
        let coin_withdrawn = aptos_forms_demo::aptos_forms_demo2_global_aggregate::withdraw_coin_claimer_1_vault(_account, amount);
        aptos_framework::coin::deposit(std::signer::address_of(_account), coin_withdrawn);

        aptos_forms_demo2_coin_claimer_1::create_aptos_forms_demo2_coin_claimer_1(
            signer_address,
        )
    }

}
