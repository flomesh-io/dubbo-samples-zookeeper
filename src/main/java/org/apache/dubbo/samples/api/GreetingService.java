/*
 *
 *   Licensed to the Apache Software Foundation (ASF) under one or more
 *   contributor license agreements.  See the NOTICE file distributed with
 *   this work for additional information regarding copyright ownership.
 *   The ASF licenses this file to You under the Apache License, Version 2.0
 *   (the "License"); you may not use this file except in compliance with
 *   the License.  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package org.apache.dubbo.samples.api;

public interface GreetingService {

    String sayHello(String name);
    
    String healthCheck();

    Person sayHelloPerson(Person p);
    
    class Person implements java.io.Serializable{
    	String name = "no-name";
    	public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getPet() {
			return pet;
		}
		public void setPet(String pet) {
			this.pet = pet;
		}
		public Father father;
		int age = 1;
    	String pet = "dog";
    	public Person(String n, int a, String p){
    		this.name = n;
    		this.age = a;
    		this.pet = p;
    		this.father = new Father(n, a);
    	}
    }
    
    class Father implements java.io.Serializable{
    	String name = "no-name";
		int age = 30;
    	public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
    	
    	public Father(String n, int a) {
    		this.name = "Grand " + n;
    		this.age = 30 + a;
    	}
    }
}
