// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

module aptos_forms_demo::aptos_forms_demo_payment_123 {
    use std::vector;

    public fun option_1000000(): u64 {
        1000000
    }

    public fun option_2000000(): u64 {
        2000000
    }

    public fun is_valid(v: u64): bool {
        v == option_1000000() || v == option_2000000()
    }

    public fun are_all_valid(vs: &vector<u64>): bool {
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
