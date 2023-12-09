# Aptos Move CLI Cheatsheet

[ToC]

## AptosFormsDemoMainForm aggregate

### Submit method

```shell
aptos move run --function-id 'default::aptos_forms_demo_main_form_aggregate::submit' \
--args u128:fr_5pqi 'string:[A,B]' 'string:[A,B]' 'string:fr_8xjs' 'string:1' u128:fr_4ok6 'string:fr_b3ub' u128:fr_1z7o 'u16:[fr_d8rw_item_1,fr_d8rw_item_2]' 'u16:[fr_dy3l_item_1,fr_dy3l_item_2]' u128:fr_6f68 'u8:[fr_47yy_item_1,fr_47yy_item_2]' 'string:[A,B]' 'string:[1,2]' 'u16:[fr_hhzp_item_1,fr_hhzp_item_2]' 'string:single_text1' u64:payment_123 \
--assume-yes
```

### Update method

```shell
aptos move run --function-id 'default::aptos_forms_demo_main_form_aggregate::update' \
--args address:signer_address u128:fr_5pqi 'string:[A,B]' 'string:[A,B]' 'string:fr_8xjs' 'string:1' u128:fr_4ok6 'string:fr_b3ub' u128:fr_1z7o 'u16:[fr_d8rw_item_1,fr_d8rw_item_2]' 'u16:[fr_dy3l_item_1,fr_dy3l_item_2]' u128:fr_6f68 'u8:[fr_47yy_item_1,fr_47yy_item_2]' 'string:[A,B]' 'string:[1,2]' 'u16:[fr_hhzp_item_1,fr_hhzp_item_2]' 'string:single_text1' u64:payment_123 \
--assume-yes
```

## AptosFormsDemoGlobal singleton object

### AdminWithdrawPayment_123_Vault method

```shell
aptos move run --function-id 'default::aptos_forms_demo_global_aggregate::admin_withdraw_payment_123_vault' \
--args u64:amount \
--assume-yes
```

