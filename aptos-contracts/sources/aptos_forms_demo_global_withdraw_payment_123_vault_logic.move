module aptos_forms_demo::aptos_forms_demo_global_withdraw_payment_123_vault_logic {
    use aptos_forms_demo::aptos_forms_demo_global;
    use aptos_framework::aptos_coin::AptosCoin;
    use aptos_framework::coin::Coin;

    friend aptos_forms_demo::aptos_forms_demo_global_aggregate;

    public(friend) fun verify(
        account: &signer,
        amount: u64,
        aptos_forms_demo_global: &aptos_forms_demo_global::AptosFormsDemoGlobal,
    ): aptos_forms_demo_global::Payment_123_VaultWithdrawn {
        let _ = account;
        aptos_forms_demo_global::new_payment_123_vault_withdrawn(
            aptos_forms_demo_global,
            amount,
        )
    }

    public(friend) fun mutate(
        _account: &signer,
        payment_123_vault_withdrawn: &aptos_forms_demo_global::Payment_123_VaultWithdrawn,
        aptos_forms_demo_global: aptos_forms_demo_global::AptosFormsDemoGlobal,
    ): (aptos_forms_demo_global::AptosFormsDemoGlobal, Coin<AptosCoin>) {
        let amount = aptos_forms_demo_global::payment_123_vault_withdrawn_amount(payment_123_vault_withdrawn);
        let vault = aptos_forms_demo_global::borrow_mut_payment_123_vault(&mut aptos_forms_demo_global);
        let w = aptos_framework::coin::extract(vault, amount);
        (aptos_forms_demo_global, w)
    }

}
