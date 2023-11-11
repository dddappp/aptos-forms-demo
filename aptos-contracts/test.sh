cd ../../XRender-Form-Utils/aptos-move

#aptos init
# Press Enter to confirm using the default values:
aptos account fund-with-faucet --account default --amount 50000000000
# View Aptos Profiles:
#aptos config show-profiles

aptos move publish --named-addresses xrender_form_utils=0x71df3ab1b6cf015aa5870a8a6e8ee0951c54e8d7d79bb59fa3b737c3a38fb93b --assume-yes

cd ../../aptos-forms-demo/aptos-contracts

#aptos init
# Press Enter to confirm using the default values:
aptos account fund-with-faucet --account default --amount 50000000000
# View Aptos Profiles:
#aptos config show-profiles

aptos move publish --named-addresses aptos_forms_demo=default,xrender_form_utils=0x71df3ab1b6cf015aa5870a8a6e8ee0951c54e8d7d79bb59fa3b737c3a38fb93b --assume-yes

aptos move run --function-id 'default::aptos_forms_demo_init::initialize' --assume-yes

aptos move run --function-id 'default::aptos_forms_demo_main_form_aggregate::submit' \
--args u128:12 'string:["A","B"]' 'string:["A","B"]' 'string:fr_8xjs' 'string:1' u128:1 'string:fr_b3ub' u128:1 'u16:[2022,1,1,2022,1,2]' 'u16:[2022,1,1,2022,1,2]' u128:1 'u8:[1,1,1,1,1,2]' 'string:["A","B"]' 'string:["1","2"]' 'u16:[2022,1,1]' 'string:single_text1' \
--assume-yes

#cd ../aptos-java-service
#mvn package
#java -jar ./aptosformsdemo-service-cli/target/aptosformsdemo-service-cli-0.0.1-SNAPSHOT.jar ddl -d "./scripts" -c "jdbc:postgresql://127.0.0.1/test2" -u postgres -p 123456
#mvn -pl aptosformsdemo-service-rest -am spring-boot:run

