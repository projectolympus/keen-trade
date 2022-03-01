# Keen Trade

**Keen Trade** (name in progress) is a Spigot-compatible plugin that adds automatic trading with Villagers..

## Trading Station

![Trading Station structure preview](https://i.postimg.cc/CK9js3t2/trading-station-selection-proposal-1.gif)

*TODO: add better structure preview. ref Minecraft wiki structures. also image quality*

The **Trading Station** is a multi-block structure, built under an employed Villager's job site block. Trades can be
selected by interacting with the *Display* Item Frame item, which will update its name to reflect the current trade.
Place items to be traded with the Villager in the input chest (e.g. paper or emeralds). The *Trading Station* will
automatically trade with the Villager, as if a player had done the trades. Any items received from trading with the
Villager will be placed by the *Trading Station* into the *output* chest.

### Components

| Component | Block/Item      | Quantity | Note
| ---       | ---             | ---      | ---
| Base      | *Resource Block* (See *Base Materials* table) | 1        | *Base Material* determines the capabilities of this *Trading Station*
| Input     | Chest           | 1        | Items to be traded with the Villager
| Output    | Chest           | 1        | Items received from trading with the Villager
| Display   | Item Frame      | 1        | Displays merchant/trade information
|           | Emerald         | 1        | renamed to "KT:TradingStation"

#### Base Materials Table

| Base Material      | Trades/work day | Non-emerald trades | Multi-item trades
| ---                | ---             | ---                | ---
| Block of Iron      | 4               | No                 | No
| Block of Gold      | 8               | No                 | No
| Block of Emerald   | 16              | Yes                | No
| Block of Netherite | 32              | Yes                | Yes

Additional *Base Material* suggestions will be considered. *Base Material* suggestions should introduce new capability
to the *Trading Station*, and ideally be a resource storage block. An example would be adding a Copper *Base Material*,
which would introduce restricted hours during which it would allow the *Trading Station* would operate.