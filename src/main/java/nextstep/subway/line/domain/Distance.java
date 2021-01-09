package nextstep.subway.line.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Distance {
    private int distance;

    protected Distance(){}

    public Distance(int distance) {
        this.distance = distance;
    }

    public int value() {
        return distance;
    }

    public Distance plus(Distance other) {
        return new Distance(this.distance + other.distance);
    }

    public Distance minus(Distance other) {
        if (this.distance <= other.distance) {
            throw new RuntimeException("역과 역 사이의 거리보다 좁은 거리를 입력해주세요");
        }
        return new Distance(this.distance - other.distance);
    }
}