/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hyperledger.account;

import org.hyperledger.common.Coin;

import java.util.List;

public class BaseAccount extends BaseReadOnlyAccount implements Account {
    public BaseAccount(KeyChain keyChain) {
        super(keyChain);
    }

    public BaseAccount(KeyChain keyChain, List<Coin> receiving) {
        super(keyChain, receiving);
    }

    @Override
    public KeyChain getChain() {
        return (KeyChain) super.getChain();
    }
}
