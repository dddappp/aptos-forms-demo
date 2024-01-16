// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

module aptos_forms_demo::aptos_forms_demo2_pass_object {

    friend aptos_forms_demo::aptos_forms_demo2_coin_claimer_1;
    friend aptos_forms_demo::aptos_forms_demo2_global;

    /// read-only 'hot potato' wrapper.
    struct PassObject<T: store> {
        value: T,
    }

    public(friend) fun new<T: store>(value: T): PassObject<T> {
        PassObject { value }
    }

    public(friend) fun extract<T: store>(pass_object: PassObject<T>): T {
        let PassObject { value } = pass_object;
        value
    }

    public fun borrow<T: store>(pass_object: &PassObject<T>): &T {
        &pass_object.value
    }
}

