<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<applicationModel>
    <name>Application Model</name>
    <className>AOBWeb</className>
    <objects>
        <object type="Page" technology="Web">
            <name>aos page</name>
            <codeName>AosPage</codeName>
            <identification>
                <properties>
                    <property name="Title" type="string" isRegExp="false"> Advantage Shopping</property>
                </properties>
            </identification>
            <children>
                <object type="EditField" technology="Web">
                    <name>ContactUsSubject</name>
                    <codeName>ContactUsSubject</codeName>
                    <identification>
                        <properties>
                            <property name="Name" type="string" isRegExp="false">WebEdit</property>
                            <property name="Type" type="string" isRegExp="false">textarea</property>
                            <property name="TagName" type="string" isRegExp="false">TEXTAREA</property>
                        </properties>
                    </identification>
                </object>
                <object type="ListBox" technology="Web">
                    <name>Select Product</name>
                    <codeName>SelectProductCombo</codeName>
                    <identification>
                        <properties>
                            <property name="InnerText" type="string" isRegExp="true">.*Headphones.*</property>
                            <property name="TagName" type="string" isRegExp="false">SELECT</property>
                        </properties>
                    </identification>
                </object>
                <object type="ListBox" technology="Web">
                    <name>Select SubProduct</name>
                    <codeName>SelectSubProduct</codeName>
                    <identification>
                        <properties>
                            <property name="TagName" type="string" isRegExp="false">SELECT</property>
                        </properties>
                        <vri>
                            <relatedObject path="AosPage.SelectProductCombo">
                                <relations>
                                    <relation type="Above" inline="false"/>
                                </relations>
                            </relatedObject>
                        </vri>
                    </identification>
                </object>
                <object type="WebElement" technology="Web">
                    <name>Email Field</name>
                    <codeName>EmailField</codeName>
                    <identification>
                        <properties>
                            <property name="TagName" type="string" isRegExp="false">LABEL</property>
                            <property name="InnerText" type="string" isRegExp="false">Email</property>
                        </properties>
                    </identification>
                </object>
                <object type="WebElement" technology="Web">
                    <name>Send Button</name>
                    <codeName>SendButton</codeName>
                    <identification>
                        <properties>
                            <property name="InnerText" type="string" isRegExp="false">SEND</property>
                        </properties>
                    </identification>
                </object>
            </children>
        </object>
    </objects>
</applicationModel>
