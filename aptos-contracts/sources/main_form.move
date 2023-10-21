// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

module aptos_forms_demo::main_form {
    use aptos_forms_demo::genesis_account;
    use aptos_forms_demo::pass_object;
    use aptos_framework::account;
    use aptos_framework::event;
    use aptos_std::table::{Self, Table};
    use std::string::String;
    use xrender_form_utils::string_range::StringRange;
    friend aptos_forms_demo::main_form_create_logic;
    friend aptos_forms_demo::main_form_aggregate;

    const EIdAlreadyExists: u64 = 101;
    const EDataTooLong: u64 = 102;
    const EInappropriateVersion: u64 = 103;
    const ENotInitialized: u64 = 110;
    const EInvalidEnumValue: u64 = 106;

    struct Events has key {
        main_form_created_handle: event::EventHandle<MainFormCreated>,
    }

    struct Tables has key {
        main_form_table: Table<address, MainForm>,
    }

    public fun initialize(account: &signer) {
        genesis_account::assert_genesis_account(account);

        let res_account = genesis_account::resource_account_signer();
        move_to(&res_account, Events {
            main_form_created_handle: account::new_event_handle<MainFormCreated>(&res_account),
        });

        move_to(
            &res_account,
            Tables {
                main_form_table: table::new(),
            },
        );

    }

    struct MainForm has store {
        signer_address: address,
        version: u64,
        fr_5pqi: u128,
        fr_duif: vector<String>,
        fr_6i34: vector<String>,
        fr_8xjs: String,
        fr_9c3f: String,
        fr_4ok6: u128,
        fr_b3ub: String,
        fr_1z7o: u128,
        fr_d8rw: StringRange,
        fr_dy3l: StringRange,
        fr_6f68: u128,
        fr_47yy: StringRange,
        fr_gh3o: vector<String>,
        fr_fbba: vector<String>,
        fr_hhzp: String,
        single_text1: String,
    }

    public fun signer_address(main_form: &MainForm): address {
        main_form.signer_address
    }

    public fun version(main_form: &MainForm): u64 {
        main_form.version
    }

    public fun fr_5pqi(main_form: &MainForm): u128 {
        main_form.fr_5pqi
    }

    public(friend) fun set_fr_5pqi(main_form: &mut MainForm, fr_5pqi: u128) {
        main_form.fr_5pqi = fr_5pqi;
    }

    public fun fr_duif(main_form: &MainForm): vector<String> {
        main_form.fr_duif
    }

    public(friend) fun set_fr_duif(main_form: &mut MainForm, fr_duif: vector<String>) {
        assert!(aptos_forms_demo::fr_duif::are_all_valid(&fr_duif), EInvalidEnumValue);
        main_form.fr_duif = fr_duif;
    }

    public fun fr_6i34(main_form: &MainForm): vector<String> {
        main_form.fr_6i34
    }

    public(friend) fun set_fr_6i34(main_form: &mut MainForm, fr_6i34: vector<String>) {
        assert!(aptos_forms_demo::fr_6i34::are_all_valid(&fr_6i34), EInvalidEnumValue);
        main_form.fr_6i34 = fr_6i34;
    }

    public fun fr_8xjs(main_form: &MainForm): String {
        main_form.fr_8xjs
    }

    public(friend) fun set_fr_8xjs(main_form: &mut MainForm, fr_8xjs: String) {
        assert!(std::string::length(&fr_8xjs) <= 255, EDataTooLong);
        main_form.fr_8xjs = fr_8xjs;
    }

    public fun fr_9c3f(main_form: &MainForm): String {
        main_form.fr_9c3f
    }

    public(friend) fun set_fr_9c3f(main_form: &mut MainForm, fr_9c3f: String) {
        assert!(aptos_forms_demo::fr_9c3f::is_valid(fr_9c3f), EInvalidEnumValue);
        main_form.fr_9c3f = fr_9c3f;
    }

    public fun fr_4ok6(main_form: &MainForm): u128 {
        main_form.fr_4ok6
    }

    public(friend) fun set_fr_4ok6(main_form: &mut MainForm, fr_4ok6: u128) {
        main_form.fr_4ok6 = fr_4ok6;
    }

    public fun fr_b3ub(main_form: &MainForm): String {
        main_form.fr_b3ub
    }

    public(friend) fun set_fr_b3ub(main_form: &mut MainForm, fr_b3ub: String) {
        assert!(std::string::length(&fr_b3ub) <= 255, EDataTooLong);
        main_form.fr_b3ub = fr_b3ub;
    }

    public fun fr_1z7o(main_form: &MainForm): u128 {
        main_form.fr_1z7o
    }

    public(friend) fun set_fr_1z7o(main_form: &mut MainForm, fr_1z7o: u128) {
        main_form.fr_1z7o = fr_1z7o;
    }

    public fun fr_d8rw(main_form: &MainForm): StringRange {
        main_form.fr_d8rw
    }

    public(friend) fun set_fr_d8rw(main_form: &mut MainForm, fr_d8rw: StringRange) {
        main_form.fr_d8rw = fr_d8rw;
    }

    public fun fr_dy3l(main_form: &MainForm): StringRange {
        main_form.fr_dy3l
    }

    public(friend) fun set_fr_dy3l(main_form: &mut MainForm, fr_dy3l: StringRange) {
        main_form.fr_dy3l = fr_dy3l;
    }

    public fun fr_6f68(main_form: &MainForm): u128 {
        main_form.fr_6f68
    }

    public(friend) fun set_fr_6f68(main_form: &mut MainForm, fr_6f68: u128) {
        main_form.fr_6f68 = fr_6f68;
    }

    public fun fr_47yy(main_form: &MainForm): StringRange {
        main_form.fr_47yy
    }

    public(friend) fun set_fr_47yy(main_form: &mut MainForm, fr_47yy: StringRange) {
        main_form.fr_47yy = fr_47yy;
    }

    public fun fr_gh3o(main_form: &MainForm): vector<String> {
        main_form.fr_gh3o
    }

    public(friend) fun set_fr_gh3o(main_form: &mut MainForm, fr_gh3o: vector<String>) {
        assert!(aptos_forms_demo::fr_gh3o::are_all_valid(&fr_gh3o), EInvalidEnumValue);
        main_form.fr_gh3o = fr_gh3o;
    }

    public fun fr_fbba(main_form: &MainForm): vector<String> {
        main_form.fr_fbba
    }

    public(friend) fun set_fr_fbba(main_form: &mut MainForm, fr_fbba: vector<String>) {
        assert!(aptos_forms_demo::fr_fbba::are_all_valid(&fr_fbba), EInvalidEnumValue);
        main_form.fr_fbba = fr_fbba;
    }

    public fun fr_hhzp(main_form: &MainForm): String {
        main_form.fr_hhzp
    }

    public(friend) fun set_fr_hhzp(main_form: &mut MainForm, fr_hhzp: String) {
        assert!(std::string::length(&fr_hhzp) <= 255, EDataTooLong);
        main_form.fr_hhzp = fr_hhzp;
    }

    public fun single_text1(main_form: &MainForm): String {
        main_form.single_text1
    }

    public(friend) fun set_single_text1(main_form: &mut MainForm, single_text1: String) {
        assert!(std::string::length(&single_text1) <= 50, EDataTooLong);
        main_form.single_text1 = single_text1;
    }

    fun new_main_form(
        signer_address: address,
        fr_5pqi: u128,
        fr_duif: vector<String>,
        fr_6i34: vector<String>,
        fr_8xjs: String,
        fr_9c3f: String,
        fr_4ok6: u128,
        fr_b3ub: String,
        fr_1z7o: u128,
        fr_d8rw: StringRange,
        fr_dy3l: StringRange,
        fr_6f68: u128,
        fr_47yy: StringRange,
        fr_gh3o: vector<String>,
        fr_fbba: vector<String>,
        fr_hhzp: String,
        single_text1: String,
    ): MainForm {
        assert!(aptos_forms_demo::fr_duif::are_all_valid(&fr_duif), EInvalidEnumValue);
        assert!(aptos_forms_demo::fr_6i34::are_all_valid(&fr_6i34), EInvalidEnumValue);
        assert!(std::string::length(&fr_8xjs) <= 255, EDataTooLong);
        assert!(aptos_forms_demo::fr_9c3f::is_valid(fr_9c3f), EInvalidEnumValue);
        assert!(std::string::length(&fr_b3ub) <= 255, EDataTooLong);
        assert!(aptos_forms_demo::fr_gh3o::are_all_valid(&fr_gh3o), EInvalidEnumValue);
        assert!(aptos_forms_demo::fr_fbba::are_all_valid(&fr_fbba), EInvalidEnumValue);
        assert!(std::string::length(&fr_hhzp) <= 255, EDataTooLong);
        assert!(std::string::length(&single_text1) <= 50, EDataTooLong);
        MainForm {
            signer_address,
            version: 0,
            fr_5pqi,
            fr_duif,
            fr_6i34,
            fr_8xjs,
            fr_9c3f,
            fr_4ok6,
            fr_b3ub,
            fr_1z7o,
            fr_d8rw,
            fr_dy3l,
            fr_6f68,
            fr_47yy,
            fr_gh3o,
            fr_fbba,
            fr_hhzp,
            single_text1,
        }
    }

    struct MainFormCreated has store, drop {
        signer_address: address,
        fr_5pqi: u128,
        fr_duif: vector<String>,
        fr_6i34: vector<String>,
        fr_8xjs: String,
        fr_9c3f: String,
        fr_4ok6: u128,
        fr_b3ub: String,
        fr_1z7o: u128,
        fr_d8rw: StringRange,
        fr_dy3l: StringRange,
        fr_6f68: u128,
        fr_47yy: StringRange,
        fr_gh3o: vector<String>,
        fr_fbba: vector<String>,
        fr_hhzp: String,
        single_text1: String,
    }

    public fun main_form_created_signer_address(main_form_created: &MainFormCreated): address {
        main_form_created.signer_address
    }

    public fun main_form_created_fr_5pqi(main_form_created: &MainFormCreated): u128 {
        main_form_created.fr_5pqi
    }

    public fun main_form_created_fr_duif(main_form_created: &MainFormCreated): vector<String> {
        main_form_created.fr_duif
    }

    public fun main_form_created_fr_6i34(main_form_created: &MainFormCreated): vector<String> {
        main_form_created.fr_6i34
    }

    public fun main_form_created_fr_8xjs(main_form_created: &MainFormCreated): String {
        main_form_created.fr_8xjs
    }

    public fun main_form_created_fr_9c3f(main_form_created: &MainFormCreated): String {
        main_form_created.fr_9c3f
    }

    public fun main_form_created_fr_4ok6(main_form_created: &MainFormCreated): u128 {
        main_form_created.fr_4ok6
    }

    public fun main_form_created_fr_b3ub(main_form_created: &MainFormCreated): String {
        main_form_created.fr_b3ub
    }

    public fun main_form_created_fr_1z7o(main_form_created: &MainFormCreated): u128 {
        main_form_created.fr_1z7o
    }

    public fun main_form_created_fr_d8rw(main_form_created: &MainFormCreated): StringRange {
        main_form_created.fr_d8rw
    }

    public fun main_form_created_fr_dy3l(main_form_created: &MainFormCreated): StringRange {
        main_form_created.fr_dy3l
    }

    public fun main_form_created_fr_6f68(main_form_created: &MainFormCreated): u128 {
        main_form_created.fr_6f68
    }

    public fun main_form_created_fr_47yy(main_form_created: &MainFormCreated): StringRange {
        main_form_created.fr_47yy
    }

    public fun main_form_created_fr_gh3o(main_form_created: &MainFormCreated): vector<String> {
        main_form_created.fr_gh3o
    }

    public fun main_form_created_fr_fbba(main_form_created: &MainFormCreated): vector<String> {
        main_form_created.fr_fbba
    }

    public fun main_form_created_fr_hhzp(main_form_created: &MainFormCreated): String {
        main_form_created.fr_hhzp
    }

    public fun main_form_created_single_text1(main_form_created: &MainFormCreated): String {
        main_form_created.single_text1
    }

    public(friend) fun new_main_form_created(
        signer_address: address,
        fr_5pqi: u128,
        fr_duif: vector<String>,
        fr_6i34: vector<String>,
        fr_8xjs: String,
        fr_9c3f: String,
        fr_4ok6: u128,
        fr_b3ub: String,
        fr_1z7o: u128,
        fr_d8rw: StringRange,
        fr_dy3l: StringRange,
        fr_6f68: u128,
        fr_47yy: StringRange,
        fr_gh3o: vector<String>,
        fr_fbba: vector<String>,
        fr_hhzp: String,
        single_text1: String,
    ): MainFormCreated {
        MainFormCreated {
            signer_address,
            fr_5pqi,
            fr_duif,
            fr_6i34,
            fr_8xjs,
            fr_9c3f,
            fr_4ok6,
            fr_b3ub,
            fr_1z7o,
            fr_d8rw,
            fr_dy3l,
            fr_6f68,
            fr_47yy,
            fr_gh3o,
            fr_fbba,
            fr_hhzp,
            single_text1,
        }
    }


    public(friend) fun create_main_form(
        signer_address: address,
        fr_5pqi: u128,
        fr_duif: vector<String>,
        fr_6i34: vector<String>,
        fr_8xjs: String,
        fr_9c3f: String,
        fr_4ok6: u128,
        fr_b3ub: String,
        fr_1z7o: u128,
        fr_d8rw: StringRange,
        fr_dy3l: StringRange,
        fr_6f68: u128,
        fr_47yy: StringRange,
        fr_gh3o: vector<String>,
        fr_fbba: vector<String>,
        fr_hhzp: String,
        single_text1: String,
    ): MainForm acquires Tables {
        asset_main_form_not_exists(signer_address);
        let main_form = new_main_form(
            signer_address,
            fr_5pqi,
            fr_duif,
            fr_6i34,
            fr_8xjs,
            fr_9c3f,
            fr_4ok6,
            fr_b3ub,
            fr_1z7o,
            fr_d8rw,
            fr_dy3l,
            fr_6f68,
            fr_47yy,
            fr_gh3o,
            fr_fbba,
            fr_hhzp,
            single_text1,
        );
        main_form
    }

    public(friend) fun asset_main_form_not_exists(
        signer_address: address,
    ) acquires Tables {
        assert!(exists<Tables>(genesis_account::resouce_account_address()), ENotInitialized);
        let tables = borrow_global_mut<Tables>(genesis_account::resouce_account_address());
        assert!(!table::contains(&tables.main_form_table, signer_address), EIdAlreadyExists);
    }

    public(friend) fun update_version_and_add(main_form: MainForm) acquires Tables {
        main_form.version = main_form.version + 1;
        //assert!(main_form.version != 0, EInappropriateVersion);
        private_add_main_form(main_form);
    }

    public(friend) fun add_main_form(main_form: MainForm) acquires Tables {
        assert!(main_form.version == 0, EInappropriateVersion);
        private_add_main_form(main_form);
    }

    public(friend) fun remove_main_form(signer_address: address): MainForm acquires Tables {
        assert!(exists<Tables>(genesis_account::resouce_account_address()), ENotInitialized);
        let tables = borrow_global_mut<Tables>(genesis_account::resouce_account_address());
        table::remove(&mut tables.main_form_table, signer_address)
    }

    fun private_add_main_form(main_form: MainForm) acquires Tables {
        assert!(exists<Tables>(genesis_account::resouce_account_address()), ENotInitialized);
        let tables = borrow_global_mut<Tables>(genesis_account::resouce_account_address());
        table::add(&mut tables.main_form_table, signer_address(&main_form), main_form);
    }

    public fun get_main_form(signer_address: address): pass_object::PassObject<MainForm> acquires Tables {
        let main_form = remove_main_form(signer_address);
        pass_object::new(main_form)
    }

    public fun return_main_form(main_form_pass_obj: pass_object::PassObject<MainForm>) acquires Tables {
        let main_form = pass_object::extract(main_form_pass_obj);
        private_add_main_form(main_form);
    }

    public(friend) fun drop_main_form(main_form: MainForm) {
        let MainForm {
            version: _version,
            signer_address: _signer_address,
            fr_5pqi: _fr_5pqi,
            fr_duif: _fr_duif,
            fr_6i34: _fr_6i34,
            fr_8xjs: _fr_8xjs,
            fr_9c3f: _fr_9c3f,
            fr_4ok6: _fr_4ok6,
            fr_b3ub: _fr_b3ub,
            fr_1z7o: _fr_1z7o,
            fr_d8rw: _fr_d8rw,
            fr_dy3l: _fr_dy3l,
            fr_6f68: _fr_6f68,
            fr_47yy: _fr_47yy,
            fr_gh3o: _fr_gh3o,
            fr_fbba: _fr_fbba,
            fr_hhzp: _fr_hhzp,
            single_text1: _single_text1,
        } = main_form;
    }

    public(friend) fun emit_main_form_created(main_form_created: MainFormCreated) acquires Events {
        assert!(exists<Events>(genesis_account::resouce_account_address()), ENotInitialized);
        let events = borrow_global_mut<Events>(genesis_account::resouce_account_address());
        event::emit_event(&mut events.main_form_created_handle, main_form_created);
    }

}
