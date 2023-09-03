#[test_only]
module aptos_forms_demo::enum_tests {
    use std::string;
    use std::string::String;
    use std::vector;

    use aptos_forms_demo::fr_6i34;
    use aptos_forms_demo::fr_9c3f;
    use aptos_forms_demo::fr_duif;

    #[test]
    public fun test_all_valid_1() {
        let v = vector::empty<String>();
        vector::push_back(&mut v, string::utf8(b"A"));
        vector::push_back(&mut v, string::utf8(b"B"));
        assert!(fr_6i34::are_all_valid(&v), 111);
    }

    #[test]
    public fun test_all_valid_2() {
        let v = vector::empty<String>();
        vector::push_back(&mut v, string::utf8(b"1"));
        vector::push_back(&mut v, string::utf8(b"2"));
        assert!(fr_9c3f::are_all_valid(&v), 111);
    }

    #[test]
    public fun test_all_valid_3() {
        let v = vector::empty<String>();
        vector::push_back(&mut v, string::utf8(b"A"));
        vector::push_back(&mut v, string::utf8(b"B"));
        assert!(fr_duif::are_all_valid(&v), 111);
    }

    #[test]
    public fun test_is_valid_1() {
        assert!(fr_9c3f::is_valid(string::utf8(b"1")), 111);
    }
}
