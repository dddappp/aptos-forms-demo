// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

module aptos_forms_demo::aptos_forms_demo_fr_fbba {
    use std::string::{Self, String};
    use std::vector;

    public fun option_1(): String {
        string::utf8(b"1")
    }

    public fun option_2(): String {
        string::utf8(b"2")
    }

    public fun option_3(): String {
        string::utf8(b"3")
    }

    public fun is_valid(v: String): bool {
        v == option_1() || v == option_2() || v == option_3()
    }

    public fun are_all_valid(vs: &vector<String>): bool {
        let i = 0;
        let l = vector::length(vs);
        while (i < l) {
            if (!is_valid(*vector::borrow(vs, i))) {
                return false
            };
            i = i + 1;
        };
        true
    }
}
