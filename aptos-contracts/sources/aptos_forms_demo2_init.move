// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

module aptos_forms_demo::aptos_forms_demo2_init {
    use aptos_forms_demo::aptos_forms_demo2_coin_claimer_1;
    use aptos_forms_demo::aptos_forms_demo2_genesis_account as genesis_account;
    use aptos_forms_demo::aptos_forms_demo2_global;

    public entry fun initialize(account: &signer) {
        genesis_account::initialize(account);
        aptos_forms_demo2_coin_claimer_1::initialize(account);
        aptos_forms_demo2_global::initialize(account);
    }

}
