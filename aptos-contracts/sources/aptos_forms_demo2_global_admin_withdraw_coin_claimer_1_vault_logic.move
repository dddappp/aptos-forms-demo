module aptos_forms_demo::aptos_forms_demo2_global_admin_withdraw_coin_claimer_1_vault_logic {
    use aptos_forms_demo::aptos_forms_demo2_global;

    friend aptos_forms_demo::aptos_forms_demo2_global_aggregate;

    public(friend) fun verify(
        account: &signer,
        amount: u64,
        aptos_forms_demo2_global: &aptos_forms_demo2_global::AptosFormsDemo2Global,
    ): aptos_forms_demo2_global::Coin_claimer_1_VaultAdminWithdrawn {
        aptos_forms_demo::aptos_forms_demo2_genesis_account::assert_genesis_account(account);
        aptos_forms_demo2_global::new_coin_claimer_1_vault_admin_withdrawn(aptos_forms_demo2_global, amount)
    }

    public(friend) fun mutate(
        _account: &signer,
        coin_claimer_1_vault_admin_withdrawn: &aptos_forms_demo2_global::Coin_claimer_1_VaultAdminWithdrawn,
        aptos_forms_demo2_global: aptos_forms_demo2_global::AptosFormsDemo2Global,
    ): aptos_forms_demo2_global::AptosFormsDemo2Global {
        let amount = aptos_forms_demo2_global::coin_claimer_1_vault_admin_withdrawn_amount(coin_claimer_1_vault_admin_withdrawn);
        let vault = aptos_forms_demo2_global::borrow_mut_coin_claimer_1_vault(&mut aptos_forms_demo2_global);
        let w = aptos_framework::coin::extract(vault, amount);
        aptos_framework::coin::deposit(std::signer::address_of(_account), w);
        aptos_forms_demo2_global
    }

}
