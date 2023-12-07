module aptos_forms_demo::aptos_forms_demo_global_deposit_payment_123_vault_logic {
    use aptos_forms_demo::aptos_forms_demo_global;
    use aptos_forms_demo::payment_123_vault_deposited;
    use aptos_framework::aptos_coin::AptosCoin;
    use aptos_framework::coin;
    use aptos_framework::coin::Coin;

    friend aptos_forms_demo::aptos_forms_demo_global_aggregate;

    public(friend) fun verify(
        account: &signer,
        amount: &Coin<AptosCoin>,
        aptos_forms_demo_global: &aptos_forms_demo_global::AptosFormsDemoGlobal,
    ): aptos_forms_demo_global::Payment_123_VaultDeposited {
        aptos_forms_demo_global::new_payment_123_vault_deposited(
            aptos_forms_demo_global,
            coin::value(amount),
        )
    }

    public(friend) fun mutate(
        _account: &signer,
        payment_123_vault_deposited: &aptos_forms_demo_global::Payment_123_VaultDeposited,
        amount: Coin<AptosCoin>,
        aptos_forms_demo_global: aptos_forms_demo_global::AptosFormsDemoGlobal,
    ): aptos_forms_demo_global::AptosFormsDemoGlobal {
        let _amount_value = payment_123_vault_deposited::amount(payment_123_vault_deposited);
        let vault = aptos_forms_demo_global::borrow_mut_payment_123_vault(&mut aptos_forms_demo_global);
        coin::merge(vault, amount);
        aptos_forms_demo_global
    }

}
