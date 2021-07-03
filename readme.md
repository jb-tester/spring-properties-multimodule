Property is marked as "Unused Property" though it is used in the different module.
- a-module depends on b-module
- a-module contains the properties files (application.properies - config file for Spring Boot project and the extra.properties file used as @PropertySource)
- the values from these files are used as @Value annotations in both modules.

Result: though the navigation from placeholder to properties file works for usages in both modules, the property key in extra.properties, used from b-module, is shown as unused.
The properties from application.properties are shown as used always.

https://youtrack.jetbrains.com/issue/IDEA-155914