// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

module aptos_forms_demo::aptos_forms_demo_global {
    use aptos_forms_demo::aptos_forms_demo_genesis_account as genesis_account;
    use aptos_forms_demo::aptos_forms_demo_pass_object as pass_object;
    use aptos_framework::account;
    use aptos_framework::aptos_coin::AptosCoin;
    use aptos_framework::coin::Coin;
    use aptos_framework::event;
    friend aptos_forms_demo::aptos_forms_demo_global_deposit_payment_123_vault_logic;
    friend aptos_forms_demo::aptos_forms_demo_global_withdraw_payment_123_vault_logic;
    friend aptos_forms_demo::aptos_forms_demo_global_admin_withdraw_payment_123_vault_logic;
    friend aptos_forms_demo::aptos_forms_demo_global_deposit_coin_claimer_1_vault_logic;
    friend aptos_forms_demo::aptos_forms_demo_global_withdraw_coin_claimer_1_vault_logic;
    friend aptos_forms_demo::aptos_forms_demo_global_admin_withdraw_coin_claimer_1_vault_logic;
    friend aptos_forms_demo::aptos_forms_demo_global_aggregate;

    const EDataTooLong: u64 = 102;
    const EInappropriateVersion: u64 = 103;
    const ENotInitialized: u64 = 110;

    struct Events has key {
        payment_123_vault_deposited_handle: event::EventHandle<Payment_123_VaultDeposited>,
        payment_123_vault_withdrawn_handle: event::EventHandle<Payment_123_VaultWithdrawn>,
        payment_123_vault_admin_withdrawn_handle: event::EventHandle<Payment_123_VaultAdminWithdrawn>,
        coin_claimer_1_vault_deposited_handle: event::EventHandle<Coin_claimer_1_VaultDeposited>,
        coin_claimer_1_vault_withdrawn_handle: event::EventHandle<Coin_claimer_1_VaultWithdrawn>,
        coin_claimer_1_vault_admin_withdrawn_handle: event::EventHandle<Coin_claimer_1_VaultAdminWithdrawn>,
    }

    public fun initialize(account: &signer) {
        genesis_account::assert_genesis_account(account);

        let res_account = genesis_account::resource_account_signer();
        move_to(&res_account, Events {
            payment_123_vault_deposited_handle: account::new_event_handle<Payment_123_VaultDeposited>(&res_account),
            payment_123_vault_withdrawn_handle: account::new_event_handle<Payment_123_VaultWithdrawn>(&res_account),
            payment_123_vault_admin_withdrawn_handle: account::new_event_handle<Payment_123_VaultAdminWithdrawn>(&res_account),
            coin_claimer_1_vault_deposited_handle: account::new_event_handle<Coin_claimer_1_VaultDeposited>(&res_account),
            coin_claimer_1_vault_withdrawn_handle: account::new_event_handle<Coin_claimer_1_VaultWithdrawn>(&res_account),
            coin_claimer_1_vault_admin_withdrawn_handle: account::new_event_handle<Coin_claimer_1_VaultAdminWithdrawn>(&res_account),
        });

        let aptos_forms_demo_global = new_aptos_forms_demo_global();
        add_aptos_forms_demo_global(aptos_forms_demo_global);
    }

    struct AptosFormsDemoGlobal has key, store {
        version: u64,
        payment_123_vault: Coin<AptosCoin>,
        coin_claimer_1_vault: Coin<AptosCoin>,
    }

    public fun version(aptos_forms_demo_global: &AptosFormsDemoGlobal): u64 {
        aptos_forms_demo_global.version
    }

    public(friend) fun borrow_payment_123_vault(aptos_forms_demo_global: &AptosFormsDemoGlobal): &Coin<AptosCoin> {
        &aptos_forms_demo_global.payment_123_vault
    }

    public(friend) fun borrow_mut_payment_123_vault(aptos_forms_demo_global: &mut AptosFormsDemoGlobal): &mut Coin<AptosCoin> {
        &mut aptos_forms_demo_global.payment_123_vault
    }

    public(friend) fun borrow_coin_claimer_1_vault(aptos_forms_demo_global: &AptosFormsDemoGlobal): &Coin<AptosCoin> {
        &aptos_forms_demo_global.coin_claimer_1_vault
    }

    public(friend) fun borrow_mut_coin_claimer_1_vault(aptos_forms_demo_global: &mut AptosFormsDemoGlobal): &mut Coin<AptosCoin> {
        &mut aptos_forms_demo_global.coin_claimer_1_vault
    }

    public(friend) fun new_aptos_forms_demo_global(
    ): AptosFormsDemoGlobal {
        AptosFormsDemoGlobal {
            version: 0,
            payment_123_vault: aptos_framework::coin::zero(),
            coin_claimer_1_vault: aptos_framework::coin::zero(),
        }
    }

    struct Payment_123_VaultDeposited has store, drop {
        version: u64,
        amount: u64,
    }

    public fun payment_123_vault_deposited_amount(payment_123_vault_deposited: &Payment_123_VaultDeposited): u64 {
        payment_123_vault_deposited.amount
    }

    public(friend) fun new_payment_123_vault_deposited(
        aptos_forms_demo_global: &AptosFormsDemoGlobal,
        amount: u64,
    ): Payment_123_VaultDeposited {
        Payment_123_VaultDeposited {
            version: version(aptos_forms_demo_global),
            amount,
        }
    }

    struct Payment_123_VaultWithdrawn has store, drop {
        version: u64,
        amount: u64,
    }

    public fun payment_123_vault_withdrawn_amount(payment_123_vault_withdrawn: &Payment_123_VaultWithdrawn): u64 {
        payment_123_vault_withdrawn.amount
    }

    public(friend) fun new_payment_123_vault_withdrawn(
        aptos_forms_demo_global: &AptosFormsDemoGlobal,
        amount: u64,
    ): Payment_123_VaultWithdrawn {
        Payment_123_VaultWithdrawn {
            version: version(aptos_forms_demo_global),
            amount,
        }
    }

    struct Payment_123_VaultAdminWithdrawn has store, drop {
        version: u64,
        amount: u64,
    }

    public fun payment_123_vault_admin_withdrawn_amount(payment_123_vault_admin_withdrawn: &Payment_123_VaultAdminWithdrawn): u64 {
        payment_123_vault_admin_withdrawn.amount
    }

    public(friend) fun new_payment_123_vault_admin_withdrawn(
        aptos_forms_demo_global: &AptosFormsDemoGlobal,
        amount: u64,
    ): Payment_123_VaultAdminWithdrawn {
        Payment_123_VaultAdminWithdrawn {
            version: version(aptos_forms_demo_global),
            amount,
        }
    }

    struct Coin_claimer_1_VaultDeposited has store, drop {
        version: u64,
        amount: u64,
    }

    public fun coin_claimer_1_vault_deposited_amount(coin_claimer_1_vault_deposited: &Coin_claimer_1_VaultDeposited): u64 {
        coin_claimer_1_vault_deposited.amount
    }

    public(friend) fun new_coin_claimer_1_vault_deposited(
        aptos_forms_demo_global: &AptosFormsDemoGlobal,
        amount: u64,
    ): Coin_claimer_1_VaultDeposited {
        Coin_claimer_1_VaultDeposited {
            version: version(aptos_forms_demo_global),
            amount,
        }
    }

    struct Coin_claimer_1_VaultWithdrawn has store, drop {
        version: u64,
        amount: u64,
    }

    public fun coin_claimer_1_vault_withdrawn_amount(coin_claimer_1_vault_withdrawn: &Coin_claimer_1_VaultWithdrawn): u64 {
        coin_claimer_1_vault_withdrawn.amount
    }

    public(friend) fun new_coin_claimer_1_vault_withdrawn(
        aptos_forms_demo_global: &AptosFormsDemoGlobal,
        amount: u64,
    ): Coin_claimer_1_VaultWithdrawn {
        Coin_claimer_1_VaultWithdrawn {
            version: version(aptos_forms_demo_global),
            amount,
        }
    }

    struct Coin_claimer_1_VaultAdminWithdrawn has store, drop {
        version: u64,
        amount: u64,
    }

    public fun coin_claimer_1_vault_admin_withdrawn_amount(coin_claimer_1_vault_admin_withdrawn: &Coin_claimer_1_VaultAdminWithdrawn): u64 {
        coin_claimer_1_vault_admin_withdrawn.amount
    }

    public(friend) fun new_coin_claimer_1_vault_admin_withdrawn(
        aptos_forms_demo_global: &AptosFormsDemoGlobal,
        amount: u64,
    ): Coin_claimer_1_VaultAdminWithdrawn {
        Coin_claimer_1_VaultAdminWithdrawn {
            version: version(aptos_forms_demo_global),
            amount,
        }
    }

    struct AptosFormsDemoGlobalInitialized has store, drop {
    }

    public(friend) fun new_aptos_forms_demo_global_initialized(
        aptos_forms_demo_global: &AptosFormsDemoGlobal,
    ): AptosFormsDemoGlobalInitialized {
        AptosFormsDemoGlobalInitialized {
        }
    }


    public(friend) fun update_version_and_add(aptos_forms_demo_global: AptosFormsDemoGlobal) {
        aptos_forms_demo_global.version = aptos_forms_demo_global.version + 1;
        //assert!(aptos_forms_demo_global.version != 0, EInappropriateVersion);
        private_add_aptos_forms_demo_global(aptos_forms_demo_global);
    }

    public(friend) fun add_aptos_forms_demo_global(aptos_forms_demo_global: AptosFormsDemoGlobal) {
        assert!(aptos_forms_demo_global.version == 0, EInappropriateVersion);
        private_add_aptos_forms_demo_global(aptos_forms_demo_global);
    }

    public(friend) fun remove_aptos_forms_demo_global(): AptosFormsDemoGlobal acquires AptosFormsDemoGlobal {
        assert!(exists<AptosFormsDemoGlobal>(genesis_account::resource_account_address()), ENotInitialized);
        move_from<AptosFormsDemoGlobal>(genesis_account::resource_account_address())
    }

    fun private_add_aptos_forms_demo_global(aptos_forms_demo_global: AptosFormsDemoGlobal) {
        move_to(&genesis_account::resource_account_signer(), aptos_forms_demo_global);
    }

    public fun get_aptos_forms_demo_global(): pass_object::PassObject<AptosFormsDemoGlobal> acquires AptosFormsDemoGlobal {
        let aptos_forms_demo_global = remove_aptos_forms_demo_global();
        pass_object::new(aptos_forms_demo_global)
    }

    public fun return_aptos_forms_demo_global(aptos_forms_demo_global_pass_obj: pass_object::PassObject<AptosFormsDemoGlobal>) {
        let aptos_forms_demo_global = pass_object::extract(aptos_forms_demo_global_pass_obj);
        private_add_aptos_forms_demo_global(aptos_forms_demo_global);
    }

    public(friend) fun drop_aptos_forms_demo_global(aptos_forms_demo_global: AptosFormsDemoGlobal) {
        let AptosFormsDemoGlobal {
            version: _version,
            payment_123_vault,
            coin_claimer_1_vault,
        } = aptos_forms_demo_global;
        aptos_framework::coin::destroy_zero(payment_123_vault);
        aptos_framework::coin::destroy_zero(coin_claimer_1_vault);
    }

    public fun aptos_forms_demo_global_exists(): bool {
        exists<AptosFormsDemoGlobal>(genesis_account::resource_account_address())
    }

    public(friend) fun emit_payment_123_vault_deposited(payment_123_vault_deposited: Payment_123_VaultDeposited) acquires Events {
        assert!(exists<Events>(genesis_account::resource_account_address()), ENotInitialized);
        let events = borrow_global_mut<Events>(genesis_account::resource_account_address());
        event::emit_event(&mut events.payment_123_vault_deposited_handle, payment_123_vault_deposited);
    }

    public(friend) fun emit_payment_123_vault_withdrawn(payment_123_vault_withdrawn: Payment_123_VaultWithdrawn) acquires Events {
        assert!(exists<Events>(genesis_account::resource_account_address()), ENotInitialized);
        let events = borrow_global_mut<Events>(genesis_account::resource_account_address());
        event::emit_event(&mut events.payment_123_vault_withdrawn_handle, payment_123_vault_withdrawn);
    }

    public(friend) fun emit_payment_123_vault_admin_withdrawn(payment_123_vault_admin_withdrawn: Payment_123_VaultAdminWithdrawn) acquires Events {
        assert!(exists<Events>(genesis_account::resource_account_address()), ENotInitialized);
        let events = borrow_global_mut<Events>(genesis_account::resource_account_address());
        event::emit_event(&mut events.payment_123_vault_admin_withdrawn_handle, payment_123_vault_admin_withdrawn);
    }

    public(friend) fun emit_coin_claimer_1_vault_deposited(coin_claimer_1_vault_deposited: Coin_claimer_1_VaultDeposited) acquires Events {
        assert!(exists<Events>(genesis_account::resource_account_address()), ENotInitialized);
        let events = borrow_global_mut<Events>(genesis_account::resource_account_address());
        event::emit_event(&mut events.coin_claimer_1_vault_deposited_handle, coin_claimer_1_vault_deposited);
    }

    public(friend) fun emit_coin_claimer_1_vault_withdrawn(coin_claimer_1_vault_withdrawn: Coin_claimer_1_VaultWithdrawn) acquires Events {
        assert!(exists<Events>(genesis_account::resource_account_address()), ENotInitialized);
        let events = borrow_global_mut<Events>(genesis_account::resource_account_address());
        event::emit_event(&mut events.coin_claimer_1_vault_withdrawn_handle, coin_claimer_1_vault_withdrawn);
    }

    public(friend) fun emit_coin_claimer_1_vault_admin_withdrawn(coin_claimer_1_vault_admin_withdrawn: Coin_claimer_1_VaultAdminWithdrawn) acquires Events {
        assert!(exists<Events>(genesis_account::resource_account_address()), ENotInitialized);
        let events = borrow_global_mut<Events>(genesis_account::resource_account_address());
        event::emit_event(&mut events.coin_claimer_1_vault_admin_withdrawn_handle, coin_claimer_1_vault_admin_withdrawn);
    }

}
