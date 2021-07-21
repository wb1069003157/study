Optional

## Construction
`Optional.of(value)`

Use `Optional.of(value)` to construct Optional. When value == null,NullPointException is thrown.
> 使用 of 来构造 Optional，当 value == null 的时候，会抛出 NullPointException。

`Optional.ofNullable(value)`

Use `Optional.ofNullable(value)` to construct Optiona. When value == null,the value in it is set to Empty instead of throwing an exception.

## 常用方法
- `get()`

返回 value 值，When value == null，抛出异常。
  
- `isPresent()`

value != null ? true:false.


