package ru.netology.statistic;

public class StatisticsService {
  /**
   * Calculate index of max income
   *
   * @param incomes - array of incomes
   * @return - index of first max value
   */
  public long findMax(long[] incomes) {
    long current_max_index = 0;
    long current_max = incomes[0];
    for (long income : incomes)
      if (current_max < income)
        current_max = income;
        return current_max;
  }
}

/* Нужно посчитать индекс максимального дохода
 * Присваем нулевое значение переменной current_max_index
 * Присваем значение переменной current_max значение из нулевой ячейки
 * Проходимся по массиву, сравнивая первое значение массива с каждым последующим значением в ячейке
 */
