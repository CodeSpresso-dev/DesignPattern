# DesignPattern
## Builder

---
## Structural

### Decorator

***Solving a Problem Using the Decorator Pattern and Combining It with Other Patterns***

**Problem:**

*Suppose we are developing a coffee ordering system that supports various types of coffee with different add-ons (such as milk, sugar, caramel, etc.). We want to allow customers to customize their orders dynamically without creating a large number of subclasses for every possible combination.*

**Solution:**

*To solve this, we use the Decorator Pattern to dynamically add features (like milk, and sugar) to coffee without modifying the base classes. However, this alone is not enough! We also want to provide customers with an easy-to-use API for ordering. Therefore, we use the Builder Pattern to create a fluent API for constructing orders and the Factory Pattern to create different coffee types.*

✅ **Patterns Used and Why They Were Chosen**

1. **Decorator:** Allows adding new features (such as milk or sugar) to coffee without modifying existing classes.
2. **Builder:** Provides a readable and intuitive way to construct coffee orders.
3. **Factory:** Simplifies coffee creation by abstracting object instantiation.

---

## Behavioral


