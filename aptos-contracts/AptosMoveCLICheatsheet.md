# Aptos Move CLI Cheatsheet

[ToC]

## AptosFormsDemoMainForm aggregate

### Submit method

```shell
aptos move run --function-id 'default::aptos_forms_demo_main_form_aggregate::submit' \
--args u128:fr_5pqi 'vector<string>:A,B' 'vector<string>:A,B' 'string:fr_8xjs' 'string:1' u128:fr_4ok6 'string:fr_b3ub' u128:fr_1z7o 'vector<string>:fr_d8rw_item_1,fr_d8rw_item_2' 'vector<string>:fr_dy3l_item_1,fr_dy3l_item_2' u128:fr_6f68 'vector<string>:fr_47yy_item_1,fr_47yy_item_2' 'vector<string>:A,B' 'vector<string>:1,2' 'string:fr_hhzp' 'string:single_text1' \
--assume-yes
```

