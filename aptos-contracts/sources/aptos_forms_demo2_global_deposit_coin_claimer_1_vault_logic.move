module aptos_forms_demo::aptos_forms_demo2_global_deposit_coin_claimer_1_vault_logic {
    use aptos_forms_demo::aptos_forms_demo2_global;

    friend aptos_forms_demo::aptos_forms_demo2_global_aggregate;

    const EInsufficientFunds: u64 = 101;

    public(friend) fun verify(
        account: &signer,
        amount: u64,
        aptos_forms_demo2_global: &aptos_forms_demo2_global::AptosFormsDemo2Global,
    ): aptos_forms_demo2_global::Coin_claimer_1_VaultDeposited {
        assert!(aptos_framework::coin::balance<aptos_framework::aptos_coin::AptosCoin>(std::signer::address_of(account)) > amount, EInsufficientFunds);
        aptos_forms_demo2_global::new_coin_claimer_1_vault_deposited(
            aptos_forms_demo2_global,
            amount,
        )
    }

    public(friend) fun mutate(
        _account: &signer,
        coin_claimer_1_vault_deposited: &aptos_forms_demo2_global::Coin_claimer_1_VaultDeposited,
        aptos_forms_demo2_global: aptos_forms_demo2_global::AptosFormsDemo2Global,
    ): aptos_forms_demo2_global::AptosFormsDemo2Global {
        let amount_v = aptos_forms_demo2_global::coin_claimer_1_vault_deposited_amount(coin_claimer_1_vault_deposited);
        let amount = aptos_framework::coin::withdraw<aptos_framework::aptos_coin::AptosCoin>(_account, amount_v);
        let vault = aptos_forms_demo2_global::borrow_mut_coin_claimer_1_vault(&mut aptos_forms_demo2_global);
        aptos_framework::coin::merge(vault, amount);
        aptos_forms_demo2_global
    }

}
