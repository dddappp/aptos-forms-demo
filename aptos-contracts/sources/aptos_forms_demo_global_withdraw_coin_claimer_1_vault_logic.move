module aptos_forms_demo::aptos_forms_demo_global_withdraw_coin_claimer_1_vault_logic {
    use aptos_forms_demo::aptos_forms_demo_global;
    use aptos_framework::aptos_coin::AptosCoin;
    use aptos_framework::coin::Coin;

    friend aptos_forms_demo::aptos_forms_demo_global_aggregate;

    public(friend) fun verify(
        account: &signer,
        amount: u64,
        aptos_forms_demo_global: &aptos_forms_demo_global::AptosFormsDemoGlobal,
    ): aptos_forms_demo_global::Coin_claimer_1_VaultWithdrawn {
        let _ = account;
        aptos_forms_demo_global::new_coin_claimer_1_vault_withdrawn(
            aptos_forms_demo_global,
            amount,
        )
    }

    public(friend) fun mutate(
        _account: &signer,
        coin_claimer_1_vault_withdrawn: &aptos_forms_demo_global::Coin_claimer_1_VaultWithdrawn,
        aptos_forms_demo_global: aptos_forms_demo_global::AptosFormsDemoGlobal,
    ): (aptos_forms_demo_global::AptosFormsDemoGlobal, Coin<AptosCoin>) {
        let _claimed_count = aptos_forms_demo_global::coin_claimer_1_claimed_count(&aptos_forms_demo_global);
        aptos_forms_demo_global::set_coin_claimer_1_claimed_count(&mut aptos_forms_demo_global, _claimed_count + 1);
        let amount = aptos_forms_demo_global::coin_claimer_1_vault_withdrawn_amount(coin_claimer_1_vault_withdrawn);
        let vault = aptos_forms_demo_global::borrow_mut_coin_claimer_1_vault(&mut aptos_forms_demo_global);
        let w = aptos_framework::coin::extract(vault, amount);
        (aptos_forms_demo_global, w)
    }

}