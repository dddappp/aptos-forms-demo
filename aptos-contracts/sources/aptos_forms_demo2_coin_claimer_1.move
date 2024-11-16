// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

module aptos_forms_demo::aptos_forms_demo2_coin_claimer_1 {
    use aptos_forms_demo::aptos_forms_demo2_genesis_account as genesis_account;
    use aptos_forms_demo::aptos_forms_demo2_pass_object as pass_object;
    use aptos_framework::account;
    use aptos_framework::event;
    use aptos_std::table::{Self, Table};
    friend aptos_forms_demo::aptos_forms_demo2_coin_claimer_1_claim_logic;
    friend aptos_forms_demo::aptos_forms_demo2_coin_claimer_1_aggregate;

    const EIdAlreadyExists: u64 = 101;
    const EDataTooLong: u64 = 102;
    const EInappropriateVersion: u64 = 103;
    const ENotInitialized: u64 = 110;

    struct Events has key {
        aptos_forms_demo2_coin_claimer_1_claimed_handle: event::EventHandle<AptosFormsDemo2Coin_claimer_1_Claimed>,
    }

    struct Tables has key {
        aptos_forms_demo2_coin_claimer_1_table: Table<address, AptosFormsDemo2CoinClaimer1>,
    }

    public fun initialize(account: &signer) {
        genesis_account::assert_genesis_account(account);

        let res_account = genesis_account::resource_account_signer();
        move_to(&res_account, Events {
            aptos_forms_demo2_coin_claimer_1_claimed_handle: account::new_event_handle<AptosFormsDemo2Coin_claimer_1_Claimed>(&res_account),
        });

        move_to(
            &res_account,
            Tables {
                aptos_forms_demo2_coin_claimer_1_table: table::new(),
            },
        );

    }

    struct AptosFormsDemo2CoinClaimer1 has store {
        signer_address: address,
        version: u64,
    }

    public fun signer_address(aptos_forms_demo2_coin_claimer_1: &AptosFormsDemo2CoinClaimer1): address {
        aptos_forms_demo2_coin_claimer_1.signer_address
    }

    public fun version(aptos_forms_demo2_coin_claimer_1: &AptosFormsDemo2CoinClaimer1): u64 {
        aptos_forms_demo2_coin_claimer_1.version
    }

    fun new_aptos_forms_demo2_coin_claimer_1(
        signer_address: address,
    ): AptosFormsDemo2CoinClaimer1 {
        AptosFormsDemo2CoinClaimer1 {
            signer_address,
            version: 0,
        }
    }

    struct AptosFormsDemo2Coin_claimer_1_Claimed has store, drop {
        signer_address: address,
        remaining_amount: u64,
        remaining_shares: u64,
    }

    public fun aptos_forms_demo2_coin_claimer_1_claimed_signer_address(aptos_forms_demo2_coin_claimer_1_claimed: &AptosFormsDemo2Coin_claimer_1_Claimed): address {
        aptos_forms_demo2_coin_claimer_1_claimed.signer_address
    }

    public fun aptos_forms_demo2_coin_claimer_1_claimed_remaining_amount(aptos_forms_demo2_coin_claimer_1_claimed: &AptosFormsDemo2Coin_claimer_1_Claimed): u64 {
        aptos_forms_demo2_coin_claimer_1_claimed.remaining_amount
    }

    public fun aptos_forms_demo2_coin_claimer_1_claimed_remaining_shares(aptos_forms_demo2_coin_claimer_1_claimed: &AptosFormsDemo2Coin_claimer_1_Claimed): u64 {
        aptos_forms_demo2_coin_claimer_1_claimed.remaining_shares
    }

    public(friend) fun new_aptos_forms_demo2_coin_claimer_1_claimed(
        signer_address: address,
        remaining_amount: u64,
        remaining_shares: u64,
    ): AptosFormsDemo2Coin_claimer_1_Claimed {
        AptosFormsDemo2Coin_claimer_1_Claimed {
            signer_address,
            remaining_amount,
            remaining_shares,
        }
    }


    public(friend) fun create_aptos_forms_demo2_coin_claimer_1(
        signer_address: address,
    ): AptosFormsDemo2CoinClaimer1 acquires Tables {
        asset_aptos_forms_demo2_coin_claimer_1_not_exists(signer_address);
        let aptos_forms_demo2_coin_claimer_1 = new_aptos_forms_demo2_coin_claimer_1(
            signer_address,
        );
        aptos_forms_demo2_coin_claimer_1
    }

    public(friend) fun asset_aptos_forms_demo2_coin_claimer_1_not_exists(
        signer_address: address,
    ) acquires Tables {
        assert!(exists<Tables>(genesis_account::resource_account_address()), ENotInitialized);
        let tables = borrow_global_mut<Tables>(genesis_account::resource_account_address());
        assert!(!table::contains(&tables.aptos_forms_demo2_coin_claimer_1_table, signer_address), EIdAlreadyExists);
    }

    public(friend) fun update_version_and_add(aptos_forms_demo2_coin_claimer_1: AptosFormsDemo2CoinClaimer1) acquires Tables {
        aptos_forms_demo2_coin_claimer_1.version = aptos_forms_demo2_coin_claimer_1.version + 1;
        //assert!(aptos_forms_demo2_coin_claimer_1.version != 0, EInappropriateVersion);
        private_add_aptos_forms_demo2_coin_claimer_1(aptos_forms_demo2_coin_claimer_1);
    }

    public(friend) fun add_aptos_forms_demo2_coin_claimer_1(aptos_forms_demo2_coin_claimer_1: AptosFormsDemo2CoinClaimer1) acquires Tables {
        assert!(aptos_forms_demo2_coin_claimer_1.version == 0, EInappropriateVersion);
        private_add_aptos_forms_demo2_coin_claimer_1(aptos_forms_demo2_coin_claimer_1);
    }

    public(friend) fun remove_aptos_forms_demo2_coin_claimer_1(signer_address: address): AptosFormsDemo2CoinClaimer1 acquires Tables {
        assert!(exists<Tables>(genesis_account::resource_account_address()), ENotInitialized);
        let tables = borrow_global_mut<Tables>(genesis_account::resource_account_address());
        table::remove(&mut tables.aptos_forms_demo2_coin_claimer_1_table, signer_address)
    }

    fun private_add_aptos_forms_demo2_coin_claimer_1(aptos_forms_demo2_coin_claimer_1: AptosFormsDemo2CoinClaimer1) acquires Tables {
        assert!(exists<Tables>(genesis_account::resource_account_address()), ENotInitialized);
        let tables = borrow_global_mut<Tables>(genesis_account::resource_account_address());
        table::add(&mut tables.aptos_forms_demo2_coin_claimer_1_table, aptos_forms_demo2_coin_claimer_1.signer_address, aptos_forms_demo2_coin_claimer_1);
    }

    public fun get_aptos_forms_demo2_coin_claimer_1(signer_address: address): pass_object::PassObject<AptosFormsDemo2CoinClaimer1> acquires Tables {
        let aptos_forms_demo2_coin_claimer_1 = remove_aptos_forms_demo2_coin_claimer_1(signer_address);
        pass_object::new(aptos_forms_demo2_coin_claimer_1)
    }

    public fun return_aptos_forms_demo2_coin_claimer_1(aptos_forms_demo2_coin_claimer_1_pass_obj: pass_object::PassObject<AptosFormsDemo2CoinClaimer1>) acquires Tables {
        let aptos_forms_demo2_coin_claimer_1 = pass_object::extract(aptos_forms_demo2_coin_claimer_1_pass_obj);
        private_add_aptos_forms_demo2_coin_claimer_1(aptos_forms_demo2_coin_claimer_1);
    }

    public(friend) fun borrow_mut(aptos_forms_demo2_coin_claimer_1_pass_obj: &mut pass_object::PassObject<AptosFormsDemo2CoinClaimer1>): &mut AptosFormsDemo2CoinClaimer1 {
        pass_object::borrow_mut(aptos_forms_demo2_coin_claimer_1_pass_obj)
    }

    public(friend) fun drop_aptos_forms_demo2_coin_claimer_1(aptos_forms_demo2_coin_claimer_1: AptosFormsDemo2CoinClaimer1) {
        let AptosFormsDemo2CoinClaimer1 {
            version: _version,
            signer_address: _signer_address,
        } = aptos_forms_demo2_coin_claimer_1;
    }

    public fun contains_aptos_forms_demo2_coin_claimer_1(signer_address: address): bool acquires Tables {
        let tables = borrow_global<Tables>(genesis_account::resource_account_address());
        table::contains(&tables.aptos_forms_demo2_coin_claimer_1_table, signer_address)
    }

    public(friend) fun emit_aptos_forms_demo2_coin_claimer_1_claimed(aptos_forms_demo2_coin_claimer_1_claimed: AptosFormsDemo2Coin_claimer_1_Claimed) acquires Events {
        assert!(exists<Events>(genesis_account::resource_account_address()), ENotInitialized);
        let events = borrow_global_mut<Events>(genesis_account::resource_account_address());
        event::emit_event(&mut events.aptos_forms_demo2_coin_claimer_1_claimed_handle, aptos_forms_demo2_coin_claimer_1_claimed);
    }

}
