package org.example.exception;

/**
 * Exceptions - это исключительные случае в работе программы
 * Также есть Errors
 *
 * Exceptions бывают 2х видов:
 * 1) checked (проверяемые) - исключительные случае, которые могут возникать в нормальной работе программы,
 * проверяются на этапе компиляции
 * например, чтение файла, все IO операция
 * Чтобы создать checked exception - необходимо наслдоваться от Exception класса
 *
 * 2) unchecked (непроверяемые) - исключительные случае, которые связаны с логикой работы программы,
 * проверяются в Runtime (т.е. во время выполния программы)
 * Чтобы создать unchecked exception - необходимо наслдоваться от RuntimeException класса
 *
 * Проверяемые исключения обязательно нужно обрабатывать либо пробрасывать. Непроверяемые — по желанию.
 */
public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}
