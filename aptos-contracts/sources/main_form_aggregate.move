// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

module aptos_forms_demo::main_form_aggregate {
    use aptos_forms_demo::main_form;
    use aptos_forms_demo::main_form_create_logic;
    use std::string::String;

    public entry fun create(
        account: &signer,
        fr_5pqi: u128,
        fr_duif: vector<String>,
        fr_6i34: vector<String>,
        fr_8xjs: String,
        fr_9c3f: String,
        fr_4ok6: u128,
        fr_b3ub: String,
        fr_1z7o: u128,
        fr_d8rw: vector<std::string::String>,
        fr_dy3l: vector<std::string::String>,
        fr_6f68: u128,
        fr_47yy: vector<std::string::String>,
        fr_gh3o: vector<String>,
        fr_fbba: vector<String>,
        fr_hhzp: String,
        single_text1: String,
    ) {
        let main_form_created = main_form_create_logic::verify(
            account,
            fr_5pqi,
            fr_duif,
            fr_6i34,
            fr_8xjs,
            fr_9c3f,
            fr_4ok6,
            fr_b3ub,
            fr_1z7o,
            xrender_form_utils::string_range::value_of(fr_d8rw),
            xrender_form_utils::string_range::value_of(fr_dy3l),
            fr_6f68,
            xrender_form_utils::string_range::value_of(fr_47yy),
            fr_gh3o,
            fr_fbba,
            fr_hhzp,
            single_text1,
        );
        let main_form = main_form_create_logic::mutate(
            account,
            &main_form_created,
        );
        main_form::add_main_form(main_form);
        main_form::emit_main_form_created(main_form_created);
    }

}
