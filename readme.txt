Requirements
================================================================================
1. JDK 1.6+ (http://www.oracle.com/technetwork/java/javase/downloads/index.html)
2. Ant (http://ant.apache.org)

Steps to Execute Application
================================================================================
1. set envirnoment set_env.bat (Optional)
2. double click compile.bat 
3. double click run.bat



Changed logs for each pattern
==================================================================================

1.Abstract Factory Pattern
/src/sg/edu/nus/iss/vmcs/uifactory
/src/sg/edu/nus/iss/vmcs/util/LabelledDisplay.java
/src/sg/edu/nus/iss/vmcs/machinery/StoreViewer.java
/src/sg/edu/nus/iss/vmcs/machinery/StoreViewerListener.java
/src/sg/edu/nus/iss/vmcs/maintenance/DrinkDisplay.java
/src/sg/edu/nus/iss/vmcs/maintenance/MaintenancePanel.java
/src/sg/edu/nus/iss/vmcs/maintenance/PasswordListener.java
/src/sg/edu/nus/iss/vmcs/maintenance/PriceDisplayListener.java

2. Iterator Pattern
/sg/edu/nus/iss/vmcs/machinery/MachineryController.java
/sg/edu/nus/iss/vmcs/store/CashStore.java
/sg/edu/nus/iss/vmcs/store/CashStoreIterator.java
/sg/edu/nus/iss/vmcs/store/Coin.java
/sg/edu/nus/iss/vmcs/store/StoreController.java
/sg/edu/nus/iss/vmcs/store/StoreIterator.java

3. Strategy Pattern
/sg/edu/nus/iss/vmcs/maintenance/MaintenanceController.java
/sg/edu/nus/iss/vmcs/store/DrinksBrand.java
/sg/edu/nus/iss/vmcs/store/PricingStrategyFactory.java
/sg/edu/nus/iss/vmcs/store/SchoolStrategy.java
/sg/edu/nus/iss/vmcs/store/CBDStrategy.java
/sg/edu/nus/iss/vmcs/store/PricingStrategy.java
/sg/edu/nus/iss/vmcs/store/HDBStrategy.java

4. Observer Pattern
/sg/edu/nus/iss/vmcs/machinery/StoreViewer.java
/sg/edu/nus/iss/vmcs/maintenance/ButtonItemDisplay.java
/sg/edu/nus/iss/vmcs/store/StoreItem.java

5. COR Pattern
/sg/edu/nus/iss/vmcs/store/StoreController.java
/sg/edu/nus/iss/vmcs/store/Coin.java
/sg/edu/nus/iss/vmcs/store/CoinHandler.java


6. Bridge Pattern
/sg/edu/nus/iss/vmcs/system/MainController.java
/sg/edu/nus/iss/vmcs/store/PropertyLoader.java
/sg/edu/nus/iss/vmcs/store/ProperytyLoaderImpl.java
/sg/edu/nus/iss/vmcs/system/CashPropertyLoader.java
/sg/edu/nus/iss/vmcs/system/DrinkPropertyLoader.java
/sg/edu/nus/iss/vmcs/system/FilePropertyLoaderImpl.java
/sg/edu/nus/iss/vmcs/system/XmlPropertyLoaderImpl.java
