# Aptos Move CLI Cheatsheet

[ToC]

## MainForm aggregate

### Create method

```shell
aptos move run --function-id 'default::main_form_aggregate::create' \
--args u128:fr_5pqi 'vector<string>:fr_duif_item_1,fr_duif_item_2' 'vector<string>:fr_6i34_item_1,fr_6i34_item_2' 'string:fr_8xjs' 'string:fr_9c3f' u128:fr_4ok6 'string:fr_b3ub' u128:fr_1z7o 'vector<string>:fr_d8rw_item_1,fr_d8rw_item_2' 'vector<string>:fr_dy3l_item_1,fr_dy3l_item_2' u128:fr_6f68 'vector<string>:fr_47yy_item_1,fr_47yy_item_2' 'vector<string>:fr_gh3o_item_1,fr_gh3o_item_2' 'vector<string>:fr_fbba_item_1,fr_fbba_item_2' 'string:fr_hhzp' 'string:single_text1' \
--assume-yes
```

